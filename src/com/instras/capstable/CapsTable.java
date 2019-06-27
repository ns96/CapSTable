package com.instras.capstable;


import com.codename1.io.Preferences;
import com.codename1.l10n.L10NManager;
import static com.codename1.ui.CN.*;
import com.codename1.ui.Form;
import userclasses.StateMachine;
import com.codename1.ui.Toolbar;
import com.codename1.ui.table.DefaultTableModel;
import com.codename1.ui.table.Table;
import com.codename1.ui.table.TableModel;
import com.codename1.util.MathUtil;
import com.codename1.util.StringUtil;
import java.util.Calendar;

/**
 * This file was generated by <a href="https://www.codenameone.com/">Codename One</a> for the purpose 
 * of building native mobile applications using Java.
 */
public class CapsTable {
    L10NManager l10n;
    
    private Form current;
    
    // static strings used to save and access input values
    // from the preferences object
    public static final String COMPANY_NAME = "company.name";
    public static final String COMPANY_YEAR = "company.year";
    public static final String COMPANY_SHARES = "company.shares";
    
    public static final String FOUNDER1_NAME = "founder1.name";
    public static final String FOUNDER1_PERCENT = "founder1.percent";
    public static final String FOUNDER1_SHARES = "founder1.shares";
    public static final String FOUNDER1_EQUITY = "founder1.equity";
    
    public static final String FOUNDER2_NAME = "founder2.name";
    public static final String FOUNDER2_PERCENT = "founder2.percent";
    public static final String FOUNDER2_SHARES = "founder12.shares";
    public static final String FOUNDER2_EQUITY = "founder2.equity";
    
    public static final String FOUNDER3_NAME = "founder3.name";
    public static final String FOUNDER3_PERCENT = "founder3.percent";
    public static final String FOUNDER3_SHARES = "founder3.shares";
    public static final String FOUNDER3_EQUITY = "founder3.equity";
    
    public static final String FOUNDER4_NAME = "founder4.name";
    public static final String FOUNDER4_PERCENT = "founder4.percent";
    public static final String FOUNDER4_SHARES = "founder4.shares";
    public static final String FOUNDER4_EQUITY = "founder4.equity";
    
    public static final String FOUNDER5_NAME = "founder5.name";
    public static final String FOUNDER5_PERCENT = "founder5.percent";
    public static final String FOUNDER5_SHARES = "founder5.shares";
    public static final String FOUNDER5_EQUITY = "founder5.equity";
    
    public static final String FOUNDER6_NAME = "founder6.name";
    public static final String FOUNDER6_PERCENT = "founder6.percent";
    public static final String FOUNDER6_SHARES = "founder6.shares";
    public static final String FOUNDER6_EQUITY = "founder6.equity";
    
    public static final String EMPLOYEE_PERCENT = "employee.percent";
    public static final String EMPLOYEE_SHARES = "employee.shares";
    public static final String EMPLOYEE_EQUITY = "employee.equity";
    
    public static final String FF1_AMOUNT = "ff1.amount";
    public static final String FF1_DISCOUNT = "ff1.discount";
    public static final String FF1_SHARES = "ff1.shares";
    public static final String FF1_YEAR = "ff1.year";
    public static final String FF1_EQUITY = "ff1.equity";
    
    public static final String FF2_AMOUNT = "ff2.amount";
    public static final String FF2_DISCOUNT = "ff2.discount";
    public static final String FF2_SHARES = "ff2.shares";
    public static final String FF2_YEAR = "ff2.year";
    public static final String FF2_EQUITY = "ff2.equity";
    
    public static final String FF_TOTAL_SHARES = "ff.total.shares";
    
    public static final String ANGEL_NAME = "angel.name";
    public static final String ANGEL_AMOUNT = "angel.amount";
    public static final String ANGEL_PERCENTAGE = "angel.percentage";
    public static final String ANGEL_RETURN_PREF = "angel.return.pref";
    public static final String ANGEL_DIVIDEND = "angel.dividend";
    public static final String ANGEL_SHARES = "angel.shares";
    public static final String ANGEL_TOTAL_SHARES = "angel.total.shares";
    public static final String ANGEL_YEAR = "angel.year";
    public static final String ANGEL_EQUITY = "angel.equity";
    
    public static final String PSA_NAME = "psa.name";
    public static final String PSA_AMOUNT = "psa.amount";
    public static final String PSA_DISCOUNT = "psa.discount";
    public static final String PSA_SHARES = "psa.shares";
    public static final String PSA_YEAR = "psa.year";
    public static final String PSA_EQUITY = "psa.equity"; 
    
    public static final String SA_YEAR = "sa.year";
    public static final String SA_TOTAL_SHARES = "sa.total.shares";
    
    public static final String SA1_NAME = "sa1.name";
    public static final String SA1_AMOUNT = "sa1.amount";
    public static final String SA1_PERCENTAGE = "sa1.percentage";
    public static final String SA1_RETURN_PREF = "sa1.return.pref";
    public static final String SA1_DIVIDEND = "sa1.dividend";
    public static final String SA1_SHARES = "sa1.shares";
    public static final String SA1_EQUITY = "sa1.equity"; 
    
    public static final String SA2_NAME = "sa2.name";
    public static final String SA2_AMOUNT = "sa2.amount";
    public static final String SA2_PERCENTAGE = "sa2.percentage";
    public static final String SA2_RETURN_PREF = "sa2.return.pref";
    public static final String SA2_DIVIDEND = "sa2.dividend";
    public static final String SA2_SHARES = "sa2.shares";
    public static final String SA2_EQUITY = "sa2.equity"; 
    
    public static final String SA3_NAME = "sa3.name";
    public static final String SA3_AMOUNT = "sa3.amount";
    public static final String SA3_PERCENTAGE = "sa3.percentage";
    public static final String SA3_RETURN_PREF = "sa3.return.pref";
    public static final String SA3_DIVIDEND = "sa3.dividend";
    public static final String SA3_SHARES = "sa3.shares";
    public static final String SA3_EQUITY = "sa3.equity"; // used to calculate proceeds on exit
    
    // used to store exit year and amount
    public static final String EXIT_YEAR = "exit.year";
    public static final String EXIT_AMOUNT = "exit.amount";
    
    // the default year
    public static int currentYear = 0;
    
    // this keeps track of the total percent for error checking
    private float totalPercent = 0.0f;
    
    // cummulative divident and return preference total
    private int cummulativeDividendsTotal = 0;
    private int returnPreferenceTotal = 0;
    
    public void init(Object context) {
        // Enable Toolbar on all Forms by default
        Toolbar.setGlobalToolbar(true);

        // Pro only feature, uncomment if you have a pro subscription
        // Log.bindCrashProtection(true);
        
        // set the current year
        currentYear = Calendar.getInstance().get(Calendar.YEAR);
    }

    public void start() {
        if(current != null){
            current.show();
            return;
        }
        new StateMachine("/theme");
    }

    public void stop() {
        current = getCurrentForm();
    }
    
    public void destroy() {
    }
    
    public void setFormatter(L10NManager l10n) {
        this.l10n = l10n;
    }
    /**
     * Method to set the default values on initial run
     */
    public void setDefaultInputValues() {
        //clear all previous values preferences
        Preferences.clearAll();
        
        // company defaults
        Preferences.set(COMPANY_NAME, "Acme, inc.");
        Preferences.set(COMPANY_YEAR, currentYear);
        Preferences.set(COMPANY_SHARES, 1000000);
        
        // founders input defualts
        Preferences.set(FOUNDER1_NAME, "Founder 1");
        Preferences.set(FOUNDER1_PERCENT, 45);
        Preferences.set(FOUNDER2_NAME, "Founder 2");
        Preferences.set(FOUNDER2_PERCENT, 45);
        Preferences.set(EMPLOYEE_PERCENT, 10);
        
        // family and friends 1 defaults
        Preferences.set(FF1_AMOUNT, 100000);
        Preferences.set(FF1_DISCOUNT, 25);
        Preferences.set(FF1_YEAR, currentYear);
        
        // family and friends 1 defaults
        Preferences.set(FF2_AMOUNT, 150000);
        Preferences.set(FF2_DISCOUNT, 20);
        Preferences.set(FF2_YEAR, currentYear);
        
        // angel / seed input defaults
        Preferences.set(ANGEL_NAME, "Bio Angels");
        Preferences.set(ANGEL_AMOUNT, 1000000);
        Preferences.set(ANGEL_PERCENTAGE, 20);
        Preferences.set(ANGEL_RETURN_PREF, 1);
        Preferences.set(ANGEL_DIVIDEND, 0);
        Preferences.set(ANGEL_YEAR, currentYear + 1);
        
        // pre series A defaults
        Preferences.set(PSA_NAME, "Jane Doe");
        Preferences.set(PSA_AMOUNT, 250000);
        Preferences.set(PSA_DISCOUNT, 15);
        Preferences.set(PSA_YEAR, currentYear + 1);
        
        // defaults for series A
        Preferences.set(SA_YEAR, currentYear + 2);
        
        Preferences.set(SA1_NAME, "VC Group");
        Preferences.set(SA1_AMOUNT, 5000000);
        Preferences.set(SA1_PERCENTAGE, 30);
        Preferences.set(SA1_RETURN_PREF, 1);
        Preferences.set(SA1_DIVIDEND, 0);
        
        Preferences.set(SA2_NAME, "");
        Preferences.set(SA2_AMOUNT, 0);
        Preferences.set(SA2_PERCENTAGE, 0);
        Preferences.set(SA2_RETURN_PREF, 1);
        Preferences.set(SA2_DIVIDEND, 0);
        
        Preferences.set(SA3_NAME, "");
        Preferences.set(SA3_AMOUNT, 0);
        Preferences.set(SA3_PERCENTAGE, 0);
        Preferences.set(SA3_RETURN_PREF, 1);
        Preferences.set(SA3_DIVIDEND, 0);
        
        Preferences.set(EXIT_AMOUNT, 200000000L);
        Preferences.set(EXIT_YEAR, currentYear + 5);
    }
    
    /**
     * Calculate the pre-money valuation for family and friends rounds
     * @return 
     */
    public float getPreMoneyValuation() {
        float amount = Preferences.get(ANGEL_AMOUNT, 0);
        float percent = Preferences.get(ANGEL_PERCENTAGE, 0)/100.0f;
        return (amount/percent - amount);
    }
    
     /**
     * Calculate the angel seed evaluation
     * @return 
     */
    public float getAngelSeedValuation() {
        float amount = Preferences.get(ANGEL_AMOUNT, 0);
        float percent = Preferences.get(ANGEL_PERCENTAGE, 0)/100.0f;
        return (amount/percent);
    }
    
    /**
     * Calculate the pre-money valuation for pre series A round
     * 
     * @return 
     */
    public float getSeriesAPreMoneyValuation() {
        float amount = Preferences.get(SA1_AMOUNT, 0) + Preferences.get(SA2_AMOUNT, 0) + Preferences.get(SA3_AMOUNT, 0);
        float percent = (Preferences.get(SA1_PERCENTAGE, 0) + Preferences.get(SA2_PERCENTAGE, 0) + Preferences.get(SA3_PERCENTAGE, 0))/100.0f;
        return (amount/percent - amount);
    }
    
    /**
     * Get the valuation for series A investors
     * @param groupNumber
     * @return 
     */
    public float getSeriesAValuation(int groupNumber) {
        float amount;
        float percent;
        
        switch (groupNumber) {
            case 0: // sum all the amounts and percentages
                amount = Preferences.get(SA1_AMOUNT, 0) + Preferences.get(SA2_AMOUNT, 0) + Preferences.get(SA3_AMOUNT, 0);
                percent = (Preferences.get(SA1_PERCENTAGE, 0) + Preferences.get(SA2_PERCENTAGE, 0) + Preferences.get(SA3_PERCENTAGE, 0))/100.0f;
                break;
            case 1:
                amount = Preferences.get(SA1_AMOUNT, 0);
                percent = Preferences.get(SA1_PERCENTAGE, 0)/100.0f;
                break;
            case 2:
                amount = Preferences.get(SA2_AMOUNT, 0);
                percent = Preferences.get(SA2_PERCENTAGE, 0)/100.0f;
                break;
            default:
                amount = Preferences.get(SA3_AMOUNT, 0);
                percent = Preferences.get(SA3_PERCENTAGE, 0)/100.0f;
                break;
        }
        
        return (amount/percent);
    }
    
    /**
     * Method to return the caps table for founders
     * @return 
     */
    public Table getCapTableFounders() {
        totalPercent = 0.0f; // reset the total percent
        
        int totalShares = Preferences.get(COMPANY_SHARES, 0);
        
        String[] f1s = getSharesAndPercent(totalShares, Preferences.get(FOUNDER1_PERCENT, 0));
        Preferences.set(FOUNDER1_SHARES, Integer.parseInt(StringUtil.replaceAll(f1s[0], ",", "")));
        String[] f2s = getSharesAndPercent(totalShares, Preferences.get(FOUNDER2_PERCENT, 0));
        Preferences.set(FOUNDER2_SHARES, Integer.parseInt(StringUtil.replaceAll(f2s[0], ",", "")));
        String[] f3s = getSharesAndPercent(totalShares, Preferences.get(FOUNDER3_PERCENT, 0));
        Preferences.set(FOUNDER3_SHARES, Integer.parseInt(StringUtil.replaceAll(f3s[0], ",", "")));
        String[] f4s = getSharesAndPercent(totalShares, Preferences.get(FOUNDER4_PERCENT, 0));
        Preferences.set(FOUNDER4_SHARES, Integer.parseInt(StringUtil.replaceAll(f4s[0], ",", "")));
        String[] f5s = getSharesAndPercent(totalShares, Preferences.get(FOUNDER5_PERCENT, 0));
        Preferences.set(FOUNDER5_SHARES, Integer.parseInt(StringUtil.replaceAll(f5s[0], ",", "")));
        String[] f6s = getSharesAndPercent(totalShares, Preferences.get(FOUNDER6_PERCENT, 0));
        Preferences.set(FOUNDER6_SHARES, Integer.parseInt(StringUtil.replaceAll(f6s[0], ",", "")));
        String[] eos = getSharesAndPercent(totalShares, Preferences.get(EMPLOYEE_PERCENT, 0));
        Preferences.set(EMPLOYEE_SHARES, Integer.parseInt(StringUtil.replaceAll(eos[0], ",", "")));
        
        String ns = l10n.format(totalShares);
        String tp = MathUtil.round(totalPercent) + "%";
        
        String[] header = {null, "SHARES", "COUNT", "%"};
        
        TableModel model = new DefaultTableModel(header, new Object[][]{
            {Preferences.get(FOUNDER1_NAME, ""), "", f1s[0], f1s[1]},
            {Preferences.get(FOUNDER2_NAME, ""), "", f2s[0], f2s[1]},
            {Preferences.get(FOUNDER3_NAME, ""), "", f3s[0], f3s[1]},
            {Preferences.get(FOUNDER4_NAME, ""), "", f4s[0], f4s[1]},
            {Preferences.get(FOUNDER5_NAME, ""), "", f5s[0], f5s[1]},
            {Preferences.get(FOUNDER6_NAME, ""), "", f6s[0], f6s[1]},
            {"Employee Options", "", eos[0], eos[1]},
            {" ", " ", " ", " "},
            {"", "Total", ns, tp},
            {" ", " ", " ", " "},
            {"", "New", ns, null},
            {" ", " ", " ", " "}
        });
        
        return new Table(model);
    }
    
    /**
     * Method to return the caps table for family and friends
     * @return 
     */
    public Table getCapTableFamilyAndFriends() {
        totalPercent = 0.0f; // reset the total percent
        int initialShares = Preferences.get(COMPANY_SHARES, 0);
        
        // calculate equity and new shares
        float valuation = getPreMoneyValuation();
        float ff1Equity = Preferences.get(FF1_AMOUNT, 0)/(valuation*(1 - Preferences.get(FF1_DISCOUNT, 0)/100.0f));
        float ff2Equity = Preferences.get(FF2_AMOUNT, 0)/(valuation*(1 - Preferences.get(FF2_DISCOUNT, 0)/100.0f));
        
        int newShares = MathUtil.round(initialShares/(1 - (ff1Equity + ff2Equity)) - initialShares);
        int totalShares = initialShares + newShares;
        
        int ff1Shares = MathUtil.round(totalShares*ff1Equity);
        Preferences.set(FF1_SHARES, ff1Shares);
        int ff2Shares = MathUtil.round(totalShares*ff2Equity);
        Preferences.set(FF2_SHARES, ff2Shares);
        Preferences.set(FF_TOTAL_SHARES, totalShares);
        
        String[] f1s = getPercentFromShares(totalShares, Preferences.get(FOUNDER1_SHARES, 0));
        String[] f2s = getPercentFromShares(totalShares, Preferences.get(FOUNDER2_SHARES, 0));
        String[] f3s = getPercentFromShares(totalShares, Preferences.get(FOUNDER3_SHARES, 0));
        String[] f4s = getPercentFromShares(totalShares, Preferences.get(FOUNDER4_SHARES, 0));
        String[] f5s = getPercentFromShares(totalShares, Preferences.get(FOUNDER5_SHARES, 0));
        String[] f6s = getPercentFromShares(totalShares, Preferences.get(FOUNDER6_SHARES, 0));
        String[] eos = getPercentFromShares(totalShares, Preferences.get(EMPLOYEE_SHARES, 0));
        String[] ff1s = getPercentFromShares(totalShares, Preferences.get(FF1_SHARES, 0));
        String[] ff2s = getPercentFromShares(totalShares, Preferences.get(FF2_SHARES, 0));
        
        String tp = MathUtil.round(totalPercent) + "%";
        
        String[] header = {null, "SHARES", "COUNT", "%"};
        
        TableModel model = new DefaultTableModel(header, new Object[][]{
            {Preferences.get(FOUNDER1_NAME, ""), "", f1s[0], f1s[1]},
            {Preferences.get(FOUNDER2_NAME, ""), "", f2s[0], f2s[1]},
            {Preferences.get(FOUNDER3_NAME, ""), "", f3s[0], f3s[1]},
            {Preferences.get(FOUNDER4_NAME, ""), "", f4s[0], f4s[1]},
            {Preferences.get(FOUNDER5_NAME, ""), "", f5s[0], f5s[1]},
            {Preferences.get(FOUNDER6_NAME, ""), "", f6s[0], f6s[1]},
            {"Employee Options", "", eos[0], eos[1]},
            {"F&F Round #1", "", ff1s[0], ff1s[1]},
            {"F&F Round #2", "", ff2s[0], ff2s[1]},
            {" ", " ", " ", " "},
            {"", "Total", l10n.format(totalShares), tp},
            {" ", " ", " ", " "},
            {"", "New", l10n.format(newShares), null},
            {" ", " ", " ", " "}
        });
        
        return new Table(model);
    }
    
    /**
     * Method to return the caps table for family and friends
     * @return 
     */
    public Table getCapTableAngelSeed() {
        totalPercent = 0.0f; // reset the total percent
        int initialShares = Preferences.get(FF_TOTAL_SHARES, 0);
        
        // calculate equity and new shares
        float angelEquity = Preferences.get(ANGEL_PERCENTAGE, 0)/100.0f;
        
        int newShares = MathUtil.round(initialShares/(1 - angelEquity) - initialShares);
        int totalShares = initialShares + newShares;
        float valuation = getAngelSeedValuation();
        float pps = valuation/totalShares;
                
        Preferences.set(ANGEL_SHARES, newShares);
        Preferences.set(ANGEL_TOTAL_SHARES, totalShares);
        
        String[] f1s = getPercentFromShares(totalShares, Preferences.get(FOUNDER1_SHARES, 0));
        String[] f2s = getPercentFromShares(totalShares, Preferences.get(FOUNDER2_SHARES, 0));
        String[] f3s = getPercentFromShares(totalShares, Preferences.get(FOUNDER3_SHARES, 0));
        String[] f4s = getPercentFromShares(totalShares, Preferences.get(FOUNDER4_SHARES, 0));
        String[] f5s = getPercentFromShares(totalShares, Preferences.get(FOUNDER5_SHARES, 0));
        String[] f6s = getPercentFromShares(totalShares, Preferences.get(FOUNDER6_SHARES, 0));
        String[] eos = getPercentFromShares(totalShares, Preferences.get(EMPLOYEE_SHARES, 0));
        String[] ff1s = getPercentFromShares(totalShares, Preferences.get(FF1_SHARES, 0));
        String[] ff2s = getPercentFromShares(totalShares, Preferences.get(FF2_SHARES, 0));
        String[] ass = getPercentFromShares(totalShares, newShares);
        
        String tp = MathUtil.round(totalPercent) + "%";
        
        String[] header = {null, "SHARES", "COUNT", "%"};
        
        TableModel model = new DefaultTableModel(header, new Object[][]{
            {Preferences.get(FOUNDER1_NAME, ""), "", f1s[0], f1s[1]},
            {Preferences.get(FOUNDER2_NAME, ""), "", f2s[0], f2s[1]},
            {Preferences.get(FOUNDER3_NAME, ""), "", f3s[0], f3s[1]},
            {Preferences.get(FOUNDER4_NAME, ""), "", f4s[0], f4s[1]},
            {Preferences.get(FOUNDER5_NAME, ""), "", f5s[0], f5s[1]},
            {Preferences.get(FOUNDER6_NAME, ""), "", f6s[0], f6s[1]},
            {"Employee Options", "", eos[0], eos[1]},
            {"F&F Round #1", "", ff1s[0], ff1s[1]},
            {"F&F Round #2", "", ff2s[0], ff2s[1]},
            {Preferences.get(ANGEL_NAME, "Angel / Seed"), "", ass[0], ass[1]},
            {" ", " ", " ", " "},
            {"", "Total", l10n.format(totalShares), tp},
            {" ", " ", " ", " "},
            {"", "New", l10n.format(newShares), null},
            {" ", " ", " ", " "},
            {"", "PPS", formatCurrency(pps, false), null},
            {" ", " ", " ", " "}
        });
        
        return new Table(model);
    }
    
    /**
     * Method to return the caps table for family and friends
     * @return 
     */
    public Table getCapTableSeriesA() {
        totalPercent = 0.0f; // reset the total percent
        int initialShares = Preferences.get(ANGEL_TOTAL_SHARES, 0);
        
        // get series A equity
        float valuation = getSeriesAPreMoneyValuation();
        float conversionValuation = valuation*(1 - Preferences.get(PSA_DISCOUNT, 0)/100.0f);
        float psaEquity = Preferences.get(PSA_AMOUNT, 0)/conversionValuation;
        float sa1Equity = Preferences.get(SA1_PERCENTAGE, 0)/100.0f;
        float sa2Equity = Preferences.get(SA2_PERCENTAGE, 0)/100.0f;
        float sa3Equity = Preferences.get(SA3_PERCENTAGE, 0)/100.0f;
        float totalEquity = psaEquity + sa1Equity + sa2Equity + sa3Equity;
        
        int newShares = MathUtil.round(initialShares/(1 - totalEquity) - initialShares);
        int totalShares = initialShares + newShares;
        valuation = getSeriesAValuation(0); // sum all the valuations?
        float pps = valuation/totalShares;
        
        int shares = MathUtil.round(totalShares*psaEquity);
        Preferences.set(PSA_SHARES, shares);
        
        shares = MathUtil.round(totalShares*sa1Equity);
        Preferences.set(SA1_SHARES, shares);
        
        shares = MathUtil.round(totalShares*sa2Equity);
        Preferences.set(SA2_SHARES, shares);
        
        shares = MathUtil.round(totalShares*sa3Equity);
        Preferences.set(SA3_SHARES, shares);
        
        Preferences.set(SA_TOTAL_SHARES, totalShares); // store for future use?
        
        String[] f1s = getPercentFromShares(totalShares, Preferences.get(FOUNDER1_SHARES, 0), FOUNDER1_EQUITY);
        String[] f2s = getPercentFromShares(totalShares, Preferences.get(FOUNDER2_SHARES, 0), FOUNDER2_EQUITY);
        String[] f3s = getPercentFromShares(totalShares, Preferences.get(FOUNDER3_SHARES, 0), FOUNDER3_EQUITY);
        String[] f4s = getPercentFromShares(totalShares, Preferences.get(FOUNDER4_SHARES, 0), FOUNDER4_EQUITY);
        String[] f5s = getPercentFromShares(totalShares, Preferences.get(FOUNDER5_SHARES, 0), FOUNDER5_EQUITY);
        String[] f6s = getPercentFromShares(totalShares, Preferences.get(FOUNDER6_SHARES, 0), FOUNDER6_EQUITY);
        String[] eos = getPercentFromShares(totalShares, Preferences.get(EMPLOYEE_SHARES, 0), EMPLOYEE_EQUITY);
        String[] ff1s = getPercentFromShares(totalShares, Preferences.get(FF1_SHARES, 0), FF1_EQUITY);
        String[] ff2s = getPercentFromShares(totalShares, Preferences.get(FF2_SHARES, 0), FF2_EQUITY);
        String[] ass = getPercentFromShares(totalShares, Preferences.get(ANGEL_SHARES, 0), ANGEL_EQUITY);
        String[] psas = getPercentFromShares(totalShares, Preferences.get(PSA_SHARES, 0), PSA_EQUITY);
        String[] sa1s = getPercentFromShares(totalShares, Preferences.get(SA1_SHARES, 0), SA1_EQUITY);
        String[] sa2s = getPercentFromShares(totalShares, Preferences.get(SA2_SHARES, 0), SA2_EQUITY);
        String[] sa3s = getPercentFromShares(totalShares, Preferences.get(SA3_SHARES, 0), SA3_EQUITY);
        
        String tp = MathUtil.round(totalPercent) + "%";
        
        String[] header = {null, "SHARES", "COUNT", "%"};
        
        TableModel model = new DefaultTableModel(header, new Object[][]{
            {Preferences.get(FOUNDER1_NAME, ""), "", f1s[0], f1s[1]},
            {Preferences.get(FOUNDER2_NAME, ""), "", f2s[0], f2s[1]},
            {Preferences.get(FOUNDER3_NAME, ""), "", f3s[0], f3s[1]},
            {Preferences.get(FOUNDER4_NAME, ""), "", f4s[0], f4s[1]},
            {Preferences.get(FOUNDER5_NAME, ""), "", f5s[0], f5s[1]},
            {Preferences.get(FOUNDER6_NAME, ""), "", f6s[0], f6s[1]},
            {"Employee Options", "", eos[0], eos[1]},
            {"F&F Round #1", "", ff1s[0], ff1s[1]},
            {"F&F Round #2", "", ff2s[0], ff2s[1]},
            {Preferences.get(ANGEL_NAME, "Angel / Seed"), "", ass[0], ass[1]},
            {Preferences.get(PSA_NAME, ""), "", psas[0], psas[1]},
            {Preferences.get(SA1_NAME, ""), "", sa1s[0], sa1s[1]},
            {Preferences.get(SA2_NAME, ""), "", sa2s[0], sa2s[1]},
            {Preferences.get(SA3_NAME, ""), "", sa3s[0], sa3s[1]},
            {"", "Total", l10n.format(totalShares), tp},
            {" ", " ", " ", " "},
            {"", "New", l10n.format(newShares), null},
            {" ", " ", " ", " "},
            {"", "PPS", formatCurrency(pps,false), null},
            {" ", " ", " ", " "}
        });
        
        return new Table(model);
    }
    
    /**
     * Method to return table for investor preferences dividends
     * @return 
     */
    public Table getReturnPreferenceTable() {
        int total = 0;
        
        int value = Preferences.get(SA3_RETURN_PREF, 0)*Preferences.get(SA3_AMOUNT, 0);
        String sa3 = formatCurrency(value);
        total += value;
        
        value = Preferences.get(SA2_RETURN_PREF, 0)*Preferences.get(SA2_AMOUNT, 0);
        String sa2 = formatCurrency(value);
        total += value;
        
        value = Preferences.get(SA1_RETURN_PREF, 0)*Preferences.get(SA1_AMOUNT, 0);
        String sa1 = formatCurrency(value);
        total += value;
        
        value = Preferences.get(SA1_RETURN_PREF, 0)*Preferences.get(PSA_AMOUNT, 0);
        String psa = formatCurrency(value);
        total += value;
        
        value = Preferences.get(ANGEL_RETURN_PREF, 0)*Preferences.get(ANGEL_AMOUNT, 0);
        String asr = formatCurrency(value);
        total += value;
        
        value = Preferences.get(ANGEL_RETURN_PREF, 0)*Preferences.get(FF2_AMOUNT, 0);
        String ff2 = formatCurrency(value);
        total += value;
        
        value = Preferences.get(ANGEL_RETURN_PREF, 0)*Preferences.get(FF1_AMOUNT, 0);
        String ff1 = formatCurrency(value);
        total += value;
        
        returnPreferenceTotal = total;
        String ts = formatCurrency(returnPreferenceTotal);
        
        String[] header = {"INVESTOR", " ", "AMOUNT"};
        
        TableModel model = new DefaultTableModel(header, new Object[][]{
            {Preferences.get(SA3_NAME, " "), " ", sa3},
            {Preferences.get(SA2_NAME, " "), " ", sa2},
            {Preferences.get(SA1_NAME, " "), "", sa1},
            {Preferences.get(PSA_NAME, " "), " ", psa},
            {Preferences.get(ANGEL_NAME, "Angel / Seed"), " ", asr},
            {"F&F Round #2", " ", ff2},
            {"F&F Round #1", " ", ff1},
            {" ", " ", " "},
            {" ", "Total", ts},
            {" ", " ", " "}
        });
        
        return new Table(model);
    }
    
    /**
     * Method to return table for cumulative dividends
     * @return 
     */
    public Table getCummulativeDividendsTable() {
        int total = 0;
        int exitYear = Preferences.get(EXIT_YEAR, 0);
                
        int value = MathUtil.round((Preferences.get(SA3_AMOUNT, 0)*Preferences.get(SA3_DIVIDEND, 0)/100.0f)*(exitYear - Preferences.get(SA_YEAR, 0)));
        String sa3 = formatCurrency(value);
        total += value;
        
        value = MathUtil.round((Preferences.get(SA2_AMOUNT, 0)*Preferences.get(SA2_DIVIDEND, 0)/100.0f)*(exitYear - Preferences.get(SA_YEAR, 0)));
        String sa2 = formatCurrency(value);
        total += value;
        
        value = MathUtil.round((Preferences.get(SA1_AMOUNT, 0)*Preferences.get(SA1_DIVIDEND, 0)/100.0f)*(exitYear - Preferences.get(SA_YEAR, 0)));
        String sa1 = formatCurrency(value);
        total += value;
        
        value = MathUtil.round((Preferences.get(PSA_AMOUNT, 0)*Preferences.get(SA1_DIVIDEND, 0)/100.0f)*(exitYear - Preferences.get(SA_YEAR, 0)));
        String psa = formatCurrency(value);
        total += value;
        
        value = MathUtil.round((Preferences.get(ANGEL_AMOUNT, 0)*Preferences.get(ANGEL_DIVIDEND, 0)/100.0f)*(exitYear - Preferences.get(ANGEL_YEAR, 0)));
        String asr = formatCurrency(value);
        total += value;
        
        value = MathUtil.round((Preferences.get(FF2_AMOUNT, 0)*Preferences.get(ANGEL_DIVIDEND, 0)/100.0f)*(exitYear - Preferences.get(ANGEL_YEAR, 0)));
        String ff2 = formatCurrency(value);
        total += value;
        
        value = MathUtil.round((Preferences.get(FF1_AMOUNT, 0)*Preferences.get(ANGEL_DIVIDEND, 0)/100.0f)*(exitYear - Preferences.get(ANGEL_YEAR, 0)));
        String ff1 = formatCurrency(value);
        total += value;
        
        cummulativeDividendsTotal = total;
        String ts = formatCurrency(cummulativeDividendsTotal);
        
        String[] header = {"INVESTOR", "", "DIVIDENDS"};
        
        TableModel model = new DefaultTableModel(header, new Object[][]{
            {Preferences.get(SA3_NAME, " "), " ", sa3},
            {Preferences.get(SA2_NAME, " "), " ", sa2},
            {Preferences.get(SA1_NAME, " "), "", sa1},
            {Preferences.get(PSA_NAME, " "), " ", psa},
            {Preferences.get(ANGEL_NAME, "Angel / Seed"), " ", asr},
            {"F&F Round #2", " ", ff2},
            {"F&F Round #1", " ", ff1},
            {" ", " ", " "},
            {" ", "Total", ts},
            {" ", " ", " "}
        });
        
        return new Table(model);
    }
    
    /**
     * Method to return table for common equity holders
     * @return 
     */
    public Table getProceedsToCommonEquityHoldersTable() {
        float totalProceeds = Preferences.get(EXIT_AMOUNT, 0L) - (returnPreferenceTotal + cummulativeDividendsTotal);
        String proceeds = "(" + formatCurrency(totalProceeds) + ")";
        
        String[] f1s = getProceeds(totalProceeds, FOUNDER1_EQUITY);
        String[] f2s = getProceeds(totalProceeds, FOUNDER2_EQUITY);
        String[] f3s = getProceeds(totalProceeds, FOUNDER3_EQUITY);
        String[] f4s = getProceeds(totalProceeds, FOUNDER4_EQUITY);
        String[] f5s = getProceeds(totalProceeds, FOUNDER5_EQUITY);
        String[] f6s = getProceeds(totalProceeds, FOUNDER6_EQUITY);
        String[] eos = getProceeds(totalProceeds, EMPLOYEE_EQUITY);
        String[] ff1s = getProceeds(totalProceeds, FF1_EQUITY);
        String[] ff2s = getProceeds(totalProceeds, FF2_EQUITY);
        String[] ass = getProceeds(totalProceeds, ANGEL_EQUITY);
        String[] psas = getProceeds(totalProceeds, PSA_EQUITY);
        String[] sa1s = getProceeds(totalProceeds, SA1_EQUITY);
        String[] sa2s = getProceeds(totalProceeds, SA2_EQUITY);
        String[] sa3s = getProceeds(totalProceeds, SA3_EQUITY);
        
        String[] header = {"INVESTOR", " ", proceeds};
        
        TableModel model = new DefaultTableModel(header, new Object[][]{
            {Preferences.get(FOUNDER1_NAME, ""), f1s[0], f1s[1]},
            {Preferences.get(FOUNDER2_NAME, ""), f2s[0], f2s[1]},
            {Preferences.get(FOUNDER3_NAME, ""), f3s[0], f3s[1]},
            {Preferences.get(FOUNDER4_NAME, ""), f4s[0], f4s[1]},
            {Preferences.get(FOUNDER5_NAME, ""), f5s[0], f5s[1]},
            {Preferences.get(FOUNDER6_NAME, ""), f6s[0], f6s[1]},
            {"Employee Options", eos[0], eos[1]},
            {"F&F Round #1", ff1s[0], ff1s[1]},
            {"F&F Round #2", ff2s[0], ff2s[1]},
            {Preferences.get(ANGEL_NAME, "Angel / Seed"), ass[0], ass[1]},
            {Preferences.get(PSA_NAME, ""), psas[0], psas[1]},
            {Preferences.get(SA1_NAME, ""), sa1s[0], sa1s[1]},
            {Preferences.get(SA2_NAME, ""), sa2s[0], sa2s[1]},
            {Preferences.get(SA3_NAME, ""), sa3s[0], sa3s[1]},
            {" ", " ", " ", " "}
        });
        
        return new Table(model);
    }
    
    /**
     * Get the shares and percent ownership in string array containing formated
     * data
     * @param totalShares
     * @param percent
     * @return 
     */
    private String[] getSharesAndPercent(int totalShares, int percent) {
        int shares = (int) (totalShares*(percent/100.f));
        String[] info = {l10n.format(shares), percent + "%"};
        totalPercent += percent;
        return info;
    }
    
    /**
     * Get the percent from the totalShares and shares ownership
     * @param totalShares
     * @param shares
     * @return 
     */
    private String[] getPercentFromShares(float totalShares, float shares, String key) {
        float percent = (shares/totalShares)*100f;
        String[] info = {l10n.format(shares), l10n.format(percent, 2) + "%"};
        totalPercent += percent;
        
        // store the equity value for calculating the proceeds to common equity 
        // holders
        if(key != null) {
            Preferences.set(key, (percent/100f));
        }
        
        return info;
    }
    
    /**
     * The default method to return percent from total share count
     * 
     * @param totalShares
     * @param shares
     * @return 
     */
    private String[] getPercentFromShares(float totalShares, float shares) {
        return getPercentFromShares(totalShares, shares, null);
    }
    
    /**
     * Calculate the proceeds based on percent equity at series A round
     * 
     * @param totalProceeds
     * @param key
     * @return 
     */
    private String[] getProceeds(float totalProceeds, String key) {
        float equity = Preferences.get(key, 0.0f);
        float proceeds = totalProceeds*equity;
        
        String formatedProceeds = formatCurrency(proceeds);
        String formatedPercent = formatPercent(equity);
        
        return new String[]{formatedPercent, formatedProceeds};
    }
    
    /**
     * A utility method for formating currency and removing the decimal 0.00
     * @param value
     */
    public String formatCurrency(float value) {
        return formatCurrency(value, true);
    }
    
    public String formatCurrency(float value, boolean round) {
        if(round) {
            value = MathUtil.round(value);
            String s = l10n.formatCurrency(value);
            return StringUtil.replaceAll(s, ".00", "");
        } else {
            return l10n.formatCurrency(value);
        }
    }
    
    /**
     * A utility method for formating currency and removing the decimal 0.00
     */
    public String formatPercent(float value) {
        value = value*100;
        return l10n.format(value, 2) + "%";
    }
}
