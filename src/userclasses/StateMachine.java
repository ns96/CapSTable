/**
 * Your application code goes here<br>
 * This file was generated by <a href="https://www.codenameone.com/">Codename One</a> for the purpose 
 * of building native mobile applications using Java.
 */


package userclasses;

import com.codename1.charts.util.ColorUtil;
import com.codename1.io.Preferences;
import com.codename1.l10n.L10NManager;
import generated.StateMachineBase;
import com.codename1.ui.*; 
import com.codename1.ui.events.*;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.util.Resources;
import com.codename1.util.MathUtil;
import com.instras.capstable.CapsTable;
import static com.instras.capstable.CapsTable.*;

/**
 *
 * @author Your name here
 */
public class StateMachine extends StateMachineBase {
    private int tabIndex;
    private int capTableTabIndex;
    private String aboutText;
    private CapsTable capsTable;
    private final boolean DEBUG = false;
    
    public StateMachine(String resFile) {
        super(resFile);
        // do not modify, write code in initVars and initialize class members there,
        // the constructor might be invoked too late due to race conditions that might occur
    }
    
    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
    protected void initVars(Resources res) {
        capsTable = new CapsTable();
        capsTable.setFormatter(L10NManager.getInstance());
        
        // see if to load the default variables, for example the program
        // is ran the first time
        if(Preferences.get("set.default.values", true) || DEBUG) {
            capsTable.setDefaultInputValues();
            Preferences.set("set.default.values", false);
        }
                
        tabIndex = 0;
        capTableTabIndex = 0;
        
        // about text
        aboutText = "This app is based on a spreadsheet from the foundersuite.com site.\n\n" +
                "It's meant to provide an easy way to learn " + 
                "about capitalization tables while on the go.\n\n\n" + 
                "Copyright 2019 By Nathan Stevens\nAll Rights Reserved";
    }
    
    @Override
    protected void beforeCapsTableForm(Form f) {
        // load the capilization tables
        findFrContainer(f).add(BorderLayout.CENTER, capsTable.getCapTableFounders());
        findFafrContainer(f).add(BorderLayout.CENTER, capsTable.getCapTableFamilyAndFriends());
        findAsrContainer(f).add(BorderLayout.CENTER, capsTable.getCapTableAngelSeed());
        findSarContainer(f).add(BorderLayout.CENTER, capsTable.getCapTableSeriesA());
        
        // now select the correct tab
        findCapsTableTabs(f).setSelectedIndex(capTableTabIndex);
    }
    
    @Override
    protected void beforeMain(Form f) {
        // add the side menues
        Toolbar tb = f.getToolbar();
        
        tb.addMaterialCommandToSideMenu("QR Share", FontImage.MATERIAL_FOLDER_SHARED, 
                e -> {capsTable.getInputData();});
        
        tb.addMaterialCommandToSideMenu("Reset Data", FontImage.MATERIAL_DELETE, 
                e -> {resetToDefaultValues();}); 

        // add a change listener to tab
        Tabs tabs = findTabs1(f);
        
        tabs.addSelectionListener((int oldSelected, int newSelected) -> {
            tabIndex = newSelected;
        });
        
        // move to the selected tab
        tabs.setSelectedIndex(tabIndex);
        
        // update the about text area
        findAboutTextArea(f).setText(aboutText);
        
        // update the main from input now
        updateMainFormInputs(f);
    }
    
    private void updateMainFormInputs(Form f) {
        // set the year and other information that has been stored in properties file
        findCompanyNameTextField(f).setText(Preferences.get(COMPANY_NAME, "Acme, Inc"));
        findYearFoundedTextField(f).setText(Preferences.get(COMPANY_YEAR, "?"));
        
        // update the exit year amount and year
        findBuyoutTextField(f).setText("" + Preferences.get(EXIT_AMOUNT, 0L));
        findExitYearTextField(f).setText("" + Preferences.get(EXIT_YEAR, currentYear));
    }
    
    @Override
    protected void beforeFounderRoundForm(Form f) {
        updateFounderRoundForm(f, true);
    }
    
    @Override
    protected void beforeFriendsFamilyRound1Form(Form f) {
        updateFamilyAndFriendsRound1Form(f, true);
    }

    @Override
    protected void beforeFriendsFamilyRound2Form(Form f) {
        updateFamilyAndFriendsRound2Form(f, true);
    }

    @Override
    protected void beforeAngelSeedRoundForm(Form f) {
        updateAngelSeedRoundForm(f, true);
    }
    
    
    @Override
    protected void beforePreSeriesAForm(Form f) {
        updatePreSeriesAForm(f, true);
    }

    @Override
    protected void beforeSeriesAForm(Form f) {
        updateSeriesAForm(f, true);
    }
    
    @Override
    protected void onMain_CapTableFoundersButtonAction(Component c, ActionEvent event) {
        capTableTabIndex = 0;
        showForm("CapsTableForm", null);
    }

    @Override
    protected void onMain_CapTableFriendFamilyButtonAction(Component c, ActionEvent event) {
        capTableTabIndex = 1;
        showForm("CapsTableForm", null);
    }

    @Override
    protected void onMain_CapTableAngelSeedButtonAction(Component c, ActionEvent event) {
        capTableTabIndex = 2;
        showForm("CapsTableForm", null);
    }
    
    @Override
    protected void onMain_CapTableSeriesAButtonAction(Component c, ActionEvent event) {
        capTableTabIndex = 3;
        showForm("CapsTableForm", null);
    }
    
    @Override
    protected void beforeWaterfallForm(Form f) {
        long exitAmount = Long.parseLong(findBuyoutTextField().getText());
        Preferences.set(EXIT_AMOUNT, exitAmount);
        
        Integer exitYear = Integer.parseInt(findExitYearTextField().getText());
        Preferences.set(EXIT_YEAR, exitYear);
        
        String buyout = capsTable.formatCurrency(exitAmount);
        f.setTitle("BUYOUT: " + buyout + " in " + exitYear);
        
        // load the caps table since the equity calcuation is needed
        capsTable.getCapTableFounders();
        capsTable.getCapTableFamilyAndFriends();
        capsTable.getCapTableAngelSeed();
        capsTable.getCapTableSeriesA();
        
        // load the waterfall tables now
        findRpContainer(f).add(BorderLayout.CENTER, capsTable.getReturnPreferenceTable());
        findCdContainer(f).add(BorderLayout.CENTER, capsTable.getCummulativeDividendsTable());
        findPcehContainer(f).add(BorderLayout.CENTER, capsTable.getProceedsToCommonEquityHoldersTable());
    }
    
    @Override
    protected void onMain_CompanyNameTextFieldAction(Component c, ActionEvent event) {
        TextField textField = (TextField)c;
        Preferences.set(COMPANY_NAME, textField.getText());
    }

    @Override
    protected void onMain_YearFoundedTextFieldAction(Component c, ActionEvent event) {
        TextField textField = (TextField)c;
        Preferences.set(COMPANY_YEAR, Integer.parseInt(textField.getText()));
    }

    @Override
    protected void onFounderRoundForm_SetFoundersInputButtonAction(Component c, ActionEvent event) {
        int value = Integer.parseInt(findSharesTextField().getText());
        Preferences.set(COMPANY_SHARES, value);
        
        String svalue = findFounder1TextField().getText();
        String nvalue = findFounder1PercentTextField().getText();
        checkAndSetIntegerInput(FOUNDER1_NAME, svalue, FOUNDER1_PERCENT, nvalue);
                
        svalue = findFounder2TextField().getText();
        nvalue = findFounder2PercentTextField().getText();
        checkAndSetIntegerInput(FOUNDER2_NAME, svalue, FOUNDER2_PERCENT, nvalue);
        
        svalue = findFounder3TextField().getText();
        nvalue = findFounder3PercentTextField().getText();
        checkAndSetIntegerInput(FOUNDER3_NAME, svalue, FOUNDER3_PERCENT, nvalue);
        
        svalue = findFounder4TextField().getText();
        nvalue = findFounder4PercentTextField().getText();
        checkAndSetIntegerInput(FOUNDER4_NAME, svalue, FOUNDER4_PERCENT, nvalue);
        
        svalue = findFounder5TextField().getText();
        nvalue = findFounder5PercentTextField().getText();
        checkAndSetIntegerInput(FOUNDER5_NAME, svalue, FOUNDER5_PERCENT, nvalue);
        
        svalue = findFounder6TextField().getText();
        nvalue = findFounder6PercentTextField().getText();
        checkAndSetIntegerInput(FOUNDER6_NAME, svalue, FOUNDER6_PERCENT, nvalue);
        
        nvalue = findEmployeePercentTextField().getText();
        checkAndSetIntegerInput(EMPLOYEE_PERCENT, nvalue);
        
        Form form = Display.getInstance().getCurrent();
        updateFounderRoundForm(form, false);
    }
    
    /**
     * Method to update the founder round form values
     */
    private void updateFounderRoundForm(Form f, boolean updateAll) {
        Integer shares = Preferences.get(COMPANY_SHARES, 0);
        Integer total = 0;
        Integer percent = 0;
        
        // update the founder names and shares
        if(updateAll) {
            findSharesTextField(f).setText(shares.toString());
            
            displayFounderInformation(FOUNDER1_NAME, FOUNDER1_PERCENT, findFounder1TextField(f), findFounder1PercentTextField(f));
            displayFounderInformation(FOUNDER2_NAME, FOUNDER2_PERCENT, findFounder2TextField(f), findFounder2PercentTextField(f));
            displayFounderInformation(FOUNDER3_NAME, FOUNDER3_PERCENT, findFounder3TextField(f), findFounder3PercentTextField(f));
            displayFounderInformation(FOUNDER4_NAME, FOUNDER4_PERCENT, findFounder4TextField(f), findFounder4PercentTextField(f));
            displayFounderInformation(FOUNDER5_NAME, FOUNDER5_PERCENT, findFounder5TextField(f), findFounder5PercentTextField(f));
            displayFounderInformation(FOUNDER6_NAME, FOUNDER6_PERCENT, findFounder6TextField(f), findFounder6PercentTextField(f));
            
            percent = Preferences.get(EMPLOYEE_PERCENT, 0);
            findEmployeePercentTextField(f).setText(percent.toString());
        }
        
        percent = Preferences.get(FOUNDER1_PERCENT, 0);
        calculateShareCount(shares, percent, findFounder1Label(f));
        total += percent;
        
        percent = Preferences.get(FOUNDER2_PERCENT, 0);
        calculateShareCount(shares, percent, findFounder2Label(f));
        total += percent;
        
        percent = Preferences.get(FOUNDER3_PERCENT, 0);
        calculateShareCount(shares, percent, findFounder3Label(f));
        total += percent;
        
        percent = Preferences.get(FOUNDER4_PERCENT, 0);
        calculateShareCount(shares, percent, findFounder4Label(f));
        total += percent;
        
        percent = Preferences.get(FOUNDER5_PERCENT, 0);
        calculateShareCount(shares, percent, findFounder5Label(f));
        total += percent;
        
        percent = Preferences.get(FOUNDER6_PERCENT, 0);
        calculateShareCount(shares, percent, findFounder6Label(f));
        total += percent;
        
        percent = Preferences.get(EMPLOYEE_PERCENT, 0);
        calculateShareCount(shares, percent, findEmployeeLabel(f));
        total += percent;
        
        // update the total text field and shares
        findTotalPercentTextField(f).setText(total.toString());
        Label totalLabel = findTotalLabel(f);
        
        if(total != 100) {
            totalLabel.getAllStyles().setFgColor(ColorUtil.MAGENTA);
            totalLabel.setText("ERROR");
        } else {
            totalLabel.getAllStyles().setFgColor(ColorUtil.BLUE);
            totalLabel.setText(L10NManager.getInstance().format(shares));
        }
    }
    
    /**
     * Method to display founder information if the field is not empty
     * @param founderKey
     * @param percentKey
     * @param founderTextField
     * @param percentTextField 
     */
    private void displayFounderInformation(String founderKey, String percentKey, TextField founderTextField, TextField percentTextField) {
        String founder = Preferences.get(founderKey, "");
        if(!founder.isEmpty()) {
            Integer percent = Preferences.get(percentKey, 0);
            founderTextField.setText(founder);
            percentTextField.setText(percent.toString());
        }
    }
    
    @Override
    protected void onFriendsFamilyRound1Form_Ffr1SetButtonAction(Component c, ActionEvent event) {
        int value = Integer.parseInt(findFfr1YearTextField().getText());
        Preferences.set(FF1_YEAR, value);
        
        value = Integer.parseInt(findFfr1RaisedTextField().getText());
        Preferences.set(FF1_AMOUNT, value);
        
        value = Integer.parseInt(findFfr1DiscountTextField().getText());
        Preferences.set(FF1_DISCOUNT, value);
        
        // update the UI components now
        Form form = Display.getInstance().getCurrent();
        updateFamilyAndFriendsRound1Form(form, false);
    }
    
    /**
     * Method to update the family and friends round 1 form values
     */
    private void updateFamilyAndFriendsRound1Form(Form f, boolean updateAll) {
        // update the input text fields
        if(updateAll) {
            Integer value = Preferences.get(FF1_YEAR, 0);
            findFfr1YearTextField(f).setText(value.toString());
            
            value = Preferences.get(FF1_AMOUNT, 0);
            findFfr1RaisedTextField(f).setText(value.toString());
            
            value = Preferences.get(FF1_DISCOUNT, 0);
            findFfr1DiscountTextField(f).setText(value.toString());
        }
        
        // calculate pre money valuation, equity and display them
        float valuation = capsTable.getPreMoneyValuation();
        float conversionValuation = valuation*(1 - Preferences.get(FF1_DISCOUNT, 0)/100.0f);
        float equity = Preferences.get(FF1_AMOUNT, 0)/conversionValuation;
        
        findFfr1ValuationTextField(f).setText(capsTable.formatCurrency(valuation));
        findFfr1ConversionValuationTextField(f).setText(capsTable.formatCurrency(conversionValuation));
        findFfr1EquityTextField(f).setText(capsTable.formatPercent(equity));
    }
    
    @Override
    protected void onFriendsFamilyRound2Form_Ffr2SetButtonAction(Component c, ActionEvent event) {
        int value = Integer.parseInt(findFfr2YearTextField().getText());
        Preferences.set(FF2_YEAR, value);
        
        value = Integer.parseInt(findFfr2RaisedTextField().getText());
        Preferences.set(FF2_AMOUNT, value);
        
        value = Integer.parseInt(findFfr2DiscountTextField().getText());
        Preferences.set(FF2_DISCOUNT, value);
        
        // update the UI components now
        Form form = Display.getInstance().getCurrent();
        updateFamilyAndFriendsRound2Form(form, false);
    }
    
    /**
     * Method to update the family and friends round 1 form values
     */
    private void updateFamilyAndFriendsRound2Form(Form f, boolean updateAll) {
        // update the input text fields
        if(updateAll) {
            Integer value = Preferences.get(FF2_YEAR, 0);
            findFfr2YearTextField(f).setText(value.toString());
            
            value = Preferences.get(FF2_AMOUNT, 0);
            findFfr2RaisedTextField(f).setText(value.toString());
            
            value = Preferences.get(FF2_DISCOUNT, 0);
            findFfr2DiscountTextField(f).setText(value.toString());
        }
        
        // calculate pre money valuation, equity and display them
        float valuation = capsTable.getPreMoneyValuation();
        float conversionValuation = valuation*(1 - Preferences.get(FF2_DISCOUNT, 0)/100.0f);
        float equity = Preferences.get(FF2_AMOUNT, 0)/conversionValuation;
        
        findFfr2ValuationTextField(f).setText(capsTable.formatCurrency(valuation));
        findFfr2ConversionValuationTextField(f).setText(capsTable.formatCurrency(conversionValuation));
        findFfr2EquityTextField(f).setText(capsTable.formatPercent(equity));
    }
    
    @Override
    protected void onAngelSeedRoundForm_AsrSetButtonAction(Component c, ActionEvent event) {
        String svalue = findAsrNameTextField().getText();
        Preferences.set(ANGEL_NAME, svalue);
        
        int value = Integer.parseInt(findAsrRaiseTextField().getText());
        Preferences.set(ANGEL_AMOUNT, value);
        
        value = Integer.parseInt(findAsrPercentageTextField().getText());
        Preferences.set(ANGEL_PERCENTAGE, value);
        
        value = Integer.parseInt(findAsrPrefTextField().getText());
        Preferences.set(ANGEL_RETURN_PREF, value);
        
        value = Integer.parseInt(findAsrDividendTextField().getText());
        Preferences.set(ANGEL_DIVIDEND, value);
        
        value = Integer.parseInt(findAsrYearTextField().getText());
        Preferences.set(ANGEL_YEAR, value);
        
        // update the UI components now
        Form form = Display.getInstance().getCurrent();
        updateAngelSeedRoundForm(form, false);
    }
    
    /**
     * Method to update the family and friends round 1 form values
     */
    private void updateAngelSeedRoundForm(Form f, boolean updateAll) {
        // update the input text fields
        if(updateAll) {
            String svalue = Preferences.get(ANGEL_NAME, "Bio Seeds");
            findAsrNameTextField(f).setText(svalue);
            
            Integer value = Preferences.get(ANGEL_YEAR, 0);
            findAsrYearTextField(f).setText(value.toString());
            
            value = Preferences.get(ANGEL_AMOUNT, 0);
            findAsrRaiseTextField(f).setText(value.toString());
            
            value = Preferences.get(ANGEL_PERCENTAGE, 0);
            findAsrPercentageTextField(f).setText(value.toString());
            
            value = Preferences.get(ANGEL_RETURN_PREF, 0);
            findAsrPrefTextField(f).setText(value.toString());
            
            value = Preferences.get(ANGEL_DIVIDEND, 0);
            findAsrDividendTextField(f).setText(value.toString());
        }
        
        // calculate pre money valuation, equity and display them
        float valuation = capsTable.getAngelSeedValuation();
        findAsrValuationTextField(f).setText(capsTable.formatCurrency(valuation));
    }
    
    @Override
    protected void onPreSeriesAForm_PsarSetButtonAction(Component c, ActionEvent event) {
        String svalue = findPsarNameTextField().getText();
        Preferences.set(PSA_NAME, svalue);
        
        int value = Integer.parseInt(findPsarYearTextField().getText());
        Preferences.set(PSA_YEAR, value);
        
        value = Integer.parseInt(findPsarRaisedTextField().getText());
        Preferences.set(PSA_AMOUNT, value);
        
        value = Integer.parseInt(findPsarDiscountTextField().getText());
        Preferences.set(PSA_DISCOUNT, value);
        
        // update the UI components now
        Form form = Display.getInstance().getCurrent();
        updatePreSeriesAForm(form, false);   
    }
    
    /**
     * Method to update the family and friends round 1 form values
     */
    private void updatePreSeriesAForm(Form f, boolean updateAll) {
        // update the input text fields
        if(updateAll) {
            String svalue = Preferences.get(PSA_NAME, "Jane Doe");
            findPsarNameTextField(f).setText(svalue);
            
            Integer value = Preferences.get(PSA_YEAR, 0);
            findPsarYearTextField(f).setText(value.toString());
            
            value = Preferences.get(PSA_AMOUNT, 0);
            findPsarRaisedTextField(f).setText(value.toString());
            
            value = Preferences.get(PSA_DISCOUNT, 0);
            findPsarDiscountTextField(f).setText(value.toString());
        }
        
        // calculate pre money valuation, equity and display them
        float valuation = capsTable.getSeriesAPreMoneyValuation();
        float conversionValuation = valuation*(1 - Preferences.get(PSA_DISCOUNT, 0)/100.0f);
        float equity = Preferences.get(PSA_AMOUNT, 0)/conversionValuation;
        
        findPsarValutationTextField(f).setText(capsTable.formatCurrency(valuation));
        findPsarConversionEvaluationTextField(f).setText(capsTable.formatCurrency(conversionValuation));
        findPsarEquityTextField(f).setText(capsTable.formatPercent(equity));
    }
    
    @Override
    protected void onSeriesAForm_SarSetButtonAction(Component c, ActionEvent event) {
        // set the year
        int value = Integer.parseInt(findSarYearTextField().getText());
        Preferences.set(SA_YEAR, value);

        // set information for investor # 1
        String svalue = findSarName1TextField().getText();
        Preferences.set(SA1_NAME, svalue);
        
        value = Integer.parseInt(findSarRaise1TextField().getText());
        Preferences.set(SA1_AMOUNT, value);
        
        value = Integer.parseInt(findSarPercentage1TextField().getText());
        Preferences.set(SA1_PERCENTAGE, value);
        
        value = Integer.parseInt(findSarPref1TextField().getText());
        Preferences.set(SA1_RETURN_PREF, value);
        
        value = Integer.parseInt(findSarDividend1TextField().getText());
        Preferences.set(SA1_DIVIDEND, value);
        
        // set information for investor # 2
        svalue = findSarName2TextField().getText();
        if(!svalue.isEmpty()) {
            Preferences.set(SA2_NAME, svalue);
        
            value = Integer.parseInt(findSarRaise2TextField().getText());
            Preferences.set(SA2_AMOUNT, value);
        
            value = Integer.parseInt(findSarPercentage2TextField().getText());
            Preferences.set(SA2_PERCENTAGE, value);
        
            value = Integer.parseInt(findSarPref2TextField().getText());
            Preferences.set(SA2_RETURN_PREF, value);
        
            value = Integer.parseInt(findSarDividend2TextField().getText());
            Preferences.set(SA2_DIVIDEND, value);
        }
        
        // set information for investor # 3
        svalue = findSarName3TextField().getText();
        if(!svalue.isEmpty()) {
            Preferences.set(SA3_NAME, svalue);
        
            value = Integer.parseInt(findSarRaise3TextField().getText());
            Preferences.set(SA3_AMOUNT, value);
        
            value = Integer.parseInt(findSarPercentage3TextField().getText());
            Preferences.set(SA3_PERCENTAGE, value);
        
            value = Integer.parseInt(findSarPref3TextField().getText());
            Preferences.set(SA3_RETURN_PREF, value);
        
            value = Integer.parseInt(findSarDividend3TextField().getText());
            Preferences.set(SA3_DIVIDEND, value);
        }
        
        // update the UI components now
        Form form = Display.getInstance().getCurrent();
        updateSeriesAForm(form, false);
    }
    
    /**
     * Method to update the family and friends round 1 form values
     */
    private void updateSeriesAForm(Form f, boolean updateAll) {
        String svalue;

        // update the input text fields
        if(updateAll) {
            Integer value = Preferences.get(SA_YEAR, 0);
            findSarYearTextField(f).setText(value.toString());
            
            svalue = Preferences.get(SA1_NAME, "VC #1");
            findSarName1TextField(f).setText(svalue);
            
            value = Preferences.get(SA1_AMOUNT, 0);
            findSarRaise1TextField(f).setText(value.toString());
            
            value = Preferences.get(SA1_PERCENTAGE, 0);
            findSarPercentage1TextField(f).setText(value.toString());
            
            value = Preferences.get(SA1_RETURN_PREF, 0);
            findSarPref1TextField(f).setText(value.toString());
            
            value = Preferences.get(SA1_DIVIDEND, 0);
            findSarDividend1TextField(f).setText(value.toString());
            
            // update vc investor # 2 if needed
            svalue = Preferences.get(SA2_NAME, "");
            
            if(!svalue.isEmpty()) {
                findSarName2TextField(f).setText(svalue);
            
                value = Preferences.get(SA2_AMOUNT, 0);
                findSarRaise2TextField(f).setText(value.toString());
            
                value = Preferences.get(SA2_PERCENTAGE, 0);
                findSarPercentage2TextField(f).setText(value.toString());
            
                value = Preferences.get(SA2_RETURN_PREF, 0);
                findSarPref2TextField(f).setText(value.toString());
            
                value = Preferences.get(SA2_DIVIDEND, 0);
                findSarDividend2TextField(f).setText(value.toString());
            }
            
            // update vc investor # 3 if needed
            svalue = Preferences.get(SA3_NAME, "");
            
            if(!svalue.isEmpty()) {
                findSarName3TextField(f).setText(svalue);
            
                value = Preferences.get(SA3_AMOUNT, 0);
                findSarRaise3TextField(f).setText(value.toString());
            
                value = Preferences.get(SA3_PERCENTAGE, 0);
                findSarPercentage3TextField(f).setText(value.toString());
            
                value = Preferences.get(SA3_RETURN_PREF, 0);
                findSarPref3TextField(f).setText(value.toString());
            
                value = Preferences.get(SA3_DIVIDEND, 0);
                findSarDividend3TextField(f).setText(value.toString());
            }
        }
        
        // calculate pre money valuation, equity and display them
        float valuation = capsTable.getSeriesAValuation(1);
        findSarValuation1TextField(f).setText(capsTable.formatCurrency(valuation));
        
        svalue = Preferences.get(SA2_NAME, "");
        if(!svalue.isEmpty()) {
            valuation = capsTable.getSeriesAValuation(2);
            findSarValuation2TextField(f).setText(capsTable.formatCurrency(valuation));
        }
        
        svalue = Preferences.get(SA3_NAME, "");
        if(!svalue.isEmpty()) {
            valuation = capsTable.getSeriesAValuation(3);
            findSarValuation3TextField(f).setText(capsTable.formatCurrency(valuation));
        }
    }
    
    /**
     * Method to calculate the percentage and display in label
     * @param percent
     * @param label 
     */
    private void calculateShareCount(double totalShares, double percent, Label label) {
        if(percent != 0) {
            Long shareCount = MathUtil.round(totalShares*(percent/100.0));
            label.setText(L10NManager.getInstance().format(shareCount));
        }
    }
    
    /**
     * Method to check to see if the input key and integer values are valid
     * 
     * @param key
     * @param value 
     */
    private boolean checkAndSetIntegerInput(String key1, String value, String key2, String num_value) {
        if(!key1.isEmpty() && !key2.isEmpty()) {
            try {
                // try converting to number
                int i = Integer.parseInt(num_value);
                Preferences.set(key2, i);
                
                // only set key1 if number value was valid
                Preferences.set(key1, value);
                return true;
            } catch(NumberFormatException e) {
                return false;
            }
        } else {
            return false;
        }
    }
    
    /**
     * Method to check to see if the input key and integer values are valid
     * 
     * @param key
     * @param value 
     */
    private boolean checkAndSetIntegerInput(String key, String num_value) {
        if(!key.isEmpty()) {
            try {
                // try converting to number
                int i = Integer.parseInt(num_value);
                Preferences.set(key, i);
                return true;
            } catch(NumberFormatException e) {
                return false;
            }
        } else {
            return false;
        }
    }
    
    
    /**
     * Reset to default data
     * 
     * @param c
     * @param event 
     */
    protected void resetToDefaultValues() {
        if(Dialog.show("Reset Data", "Really delete current input data and reset to default values?  This cannot be undone!", "YES", "NO")) {
            capsTable.setDefaultInputValues();
            Form f = Display.getInstance().getCurrent();
            updateMainFormInputs(f);
        } else {
            System.out.println("Smart choice ...");
        }
    }
}
