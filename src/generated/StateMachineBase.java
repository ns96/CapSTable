/**
 * This class contains generated code from the Codename One Designer, DO NOT MODIFY!
 * This class is designed for subclassing that way the code generator can overwrite it
 * anytime without erasing your changes which should exist in a subclass!
 * For details about this file and how it works please read this blog post:
 * http://codenameone.blogspot.com/2010/10/ui-builder-class-how-to-actually-use.html
*/
package generated;

import com.codename1.ui.*;
import com.codename1.ui.util.*;
import com.codename1.ui.plaf.*;
import java.util.Hashtable;
import com.codename1.ui.events.*;

public abstract class StateMachineBase extends UIBuilder {
    private Container aboutToShowThisContainer;
    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
    /**
    * @deprecated use the version that accepts a resource as an argument instead
    
**/
    protected void initVars() {}

    protected void initVars(Resources res) {}

    public StateMachineBase(Resources res, String resPath, boolean loadTheme) {
        startApp(res, resPath, loadTheme);
    }

    public Container startApp(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("TextArea", com.codename1.ui.TextArea.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("TextField", com.codename1.ui.TextField.class);
        UIBuilder.registerCustomComponent("Tabs", com.codename1.ui.Tabs.class);
        UIBuilder.registerCustomComponent("SpanLabel", com.codename1.components.SpanLabel.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    if(resPath.endsWith(".res")) {
                        res = Resources.open(resPath);
                        System.out.println("Warning: you should construct the state machine without the .res extension to allow theme overlays");
                    } else {
                        res = Resources.openLayered(resPath);
                    }
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        if(res != null) {
            setResourceFilePath(resPath);
            setResourceFile(res);
            initVars(res);
            return showForm(getFirstFormName(), null);
        } else {
            Form f = (Form)createContainer(resPath, getFirstFormName());
            initVars(fetchResourceFile());
            beforeShow(f);
            f.show();
            postShow(f);
            return f;
        }
    }

    protected String getFirstFormName() {
        return "Main";
    }

    public Container createWidget(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("TextArea", com.codename1.ui.TextArea.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("TextField", com.codename1.ui.TextField.class);
        UIBuilder.registerCustomComponent("Tabs", com.codename1.ui.Tabs.class);
        UIBuilder.registerCustomComponent("SpanLabel", com.codename1.components.SpanLabel.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    res = Resources.openLayered(resPath);
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        return createContainer(resPath, "Main");
    }

    protected void initTheme(Resources res) {
            String[] themes = res.getThemeResourceNames();
            if(themes != null && themes.length > 0) {
                UIManager.getInstance().setThemeProps(res.getTheme(themes[0]));
            }
    }

    public StateMachineBase() {
    }

    public StateMachineBase(String resPath) {
        this(null, resPath, true);
    }

    public StateMachineBase(Resources res) {
        this(res, null, true);
    }

    public StateMachineBase(String resPath, boolean loadTheme) {
        this(null, resPath, loadTheme);
    }

    public StateMachineBase(Resources res, boolean loadTheme) {
        this(res, null, loadTheme);
    }

    public com.codename1.ui.TextField findFounder5TextField(Component root) {
        return (com.codename1.ui.TextField)findByName("founder5TextField", root);
    }

    public com.codename1.ui.TextField findFounder5TextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("founder5TextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("founder5TextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.SpanLabel findSpanLabel21(Component root) {
        return (com.codename1.components.SpanLabel)findByName("SpanLabel21", root);
    }

    public com.codename1.components.SpanLabel findSpanLabel21() {
        com.codename1.components.SpanLabel cmp = (com.codename1.components.SpanLabel)findByName("SpanLabel21", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.SpanLabel)findByName("SpanLabel21", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findCompanyNameTextField(Component root) {
        return (com.codename1.ui.TextField)findByName("companyNameTextField", root);
    }

    public com.codename1.ui.TextField findCompanyNameTextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("companyNameTextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("companyNameTextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findPsarYearTextField(Component root) {
        return (com.codename1.ui.TextField)findByName("psarYearTextField", root);
    }

    public com.codename1.ui.TextField findPsarYearTextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("psarYearTextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("psarYearTextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findFounder4Label(Component root) {
        return (com.codename1.ui.Label)findByName("founder4Label", root);
    }

    public com.codename1.ui.Label findFounder4Label() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("founder4Label", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("founder4Label", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findRpContainer(Component root) {
        return (com.codename1.ui.Container)findByName("rpContainer", root);
    }

    public com.codename1.ui.Container findRpContainer() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("rpContainer", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("rpContainer", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findFfr1ConversionValuationTextField(Component root) {
        return (com.codename1.ui.TextField)findByName("ffr1ConversionValuationTextField", root);
    }

    public com.codename1.ui.TextField findFfr1ConversionValuationTextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("ffr1ConversionValuationTextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("ffr1ConversionValuationTextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel411(Component root) {
        return (com.codename1.ui.Label)findByName("Label411", root);
    }

    public com.codename1.ui.Label findLabel411() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label411", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label411", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findAsrPrefTextField(Component root) {
        return (com.codename1.ui.TextField)findByName("asrPrefTextField", root);
    }

    public com.codename1.ui.TextField findAsrPrefTextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("asrPrefTextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("asrPrefTextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Tabs findWaterfallTabs(Component root) {
        return (com.codename1.ui.Tabs)findByName("waterfallTabs", root);
    }

    public com.codename1.ui.Tabs findWaterfallTabs() {
        com.codename1.ui.Tabs cmp = (com.codename1.ui.Tabs)findByName("waterfallTabs", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Tabs)findByName("waterfallTabs", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findPsarConversionEvaluationTextField(Component root) {
        return (com.codename1.ui.TextField)findByName("psarConversionEvaluationTextField", root);
    }

    public com.codename1.ui.TextField findPsarConversionEvaluationTextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("psarConversionEvaluationTextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("psarConversionEvaluationTextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findFounder5Label(Component root) {
        return (com.codename1.ui.Label)findByName("founder5Label", root);
    }

    public com.codename1.ui.Label findFounder5Label() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("founder5Label", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("founder5Label", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findSarDividend1TextField(Component root) {
        return (com.codename1.ui.TextField)findByName("sarDividend1TextField", root);
    }

    public com.codename1.ui.TextField findSarDividend1TextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("sarDividend1TextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("sarDividend1TextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.SpanLabel findSpanLabel11(Component root) {
        return (com.codename1.components.SpanLabel)findByName("SpanLabel11", root);
    }

    public com.codename1.components.SpanLabel findSpanLabel11() {
        com.codename1.components.SpanLabel cmp = (com.codename1.components.SpanLabel)findByName("SpanLabel11", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.SpanLabel)findByName("SpanLabel11", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findFfr1EquityTextField(Component root) {
        return (com.codename1.ui.TextField)findByName("ffr1EquityTextField", root);
    }

    public com.codename1.ui.TextField findFfr1EquityTextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("ffr1EquityTextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("ffr1EquityTextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findFfr2ConversionValuationTextField(Component root) {
        return (com.codename1.ui.TextField)findByName("ffr2ConversionValuationTextField", root);
    }

    public com.codename1.ui.TextField findFfr2ConversionValuationTextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("ffr2ConversionValuationTextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("ffr2ConversionValuationTextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel41(Component root) {
        return (com.codename1.ui.Label)findByName("Label41", root);
    }

    public com.codename1.ui.Label findLabel41() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label41", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label41", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findFounder6Label(Component root) {
        return (com.codename1.ui.Label)findByName("founder6Label", root);
    }

    public com.codename1.ui.Label findFounder6Label() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("founder6Label", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("founder6Label", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findFounder3PercentTextField(Component root) {
        return (com.codename1.ui.TextField)findByName("founder3PercentTextField", root);
    }

    public com.codename1.ui.TextField findFounder3PercentTextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("founder3PercentTextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("founder3PercentTextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findSarYearTextField(Component root) {
        return (com.codename1.ui.TextField)findByName("sarYearTextField", root);
    }

    public com.codename1.ui.TextField findSarYearTextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("sarYearTextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("sarYearTextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel311(Component root) {
        return (com.codename1.ui.Label)findByName("Label311", root);
    }

    public com.codename1.ui.Label findLabel311() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label311", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label311", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findFounder6PercentTextField(Component root) {
        return (com.codename1.ui.TextField)findByName("founder6PercentTextField", root);
    }

    public com.codename1.ui.TextField findFounder6PercentTextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("founder6PercentTextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("founder6PercentTextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findSarRaise1TextField(Component root) {
        return (com.codename1.ui.TextField)findByName("sarRaise1TextField", root);
    }

    public com.codename1.ui.TextField findSarRaise1TextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("sarRaise1TextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("sarRaise1TextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findFafrContainer(Component root) {
        return (com.codename1.ui.Container)findByName("fafrContainer", root);
    }

    public com.codename1.ui.Container findFafrContainer() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("fafrContainer", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("fafrContainer", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findCdContainer(Component root) {
        return (com.codename1.ui.Container)findByName("cdContainer", root);
    }

    public com.codename1.ui.Container findCdContainer() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("cdContainer", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("cdContainer", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findFfr2YearTextField(Component root) {
        return (com.codename1.ui.TextField)findByName("ffr2YearTextField", root);
    }

    public com.codename1.ui.TextField findFfr2YearTextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("ffr2YearTextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("ffr2YearTextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findSarValuation1TextField(Component root) {
        return (com.codename1.ui.TextField)findByName("sarValuation1TextField", root);
    }

    public com.codename1.ui.TextField findSarValuation1TextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("sarValuation1TextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("sarValuation1TextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findFounder3Label(Component root) {
        return (com.codename1.ui.Label)findByName("founder3Label", root);
    }

    public com.codename1.ui.Label findFounder3Label() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("founder3Label", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("founder3Label", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findPsarSetButton(Component root) {
        return (com.codename1.ui.Button)findByName("psarSetButton", root);
    }

    public com.codename1.ui.Button findPsarSetButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("psarSetButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("psarSetButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findPcehContainer(Component root) {
        return (com.codename1.ui.Container)findByName("pcehContainer", root);
    }

    public com.codename1.ui.Container findPcehContainer() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("pcehContainer", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("pcehContainer", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel31(Component root) {
        return (com.codename1.ui.Label)findByName("Label31", root);
    }

    public com.codename1.ui.Label findLabel31() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label31", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label31", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findFounder2Label(Component root) {
        return (com.codename1.ui.Label)findByName("founder2Label", root);
    }

    public com.codename1.ui.Label findFounder2Label() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("founder2Label", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("founder2Label", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findTotalTextField(Component root) {
        return (com.codename1.ui.TextField)findByName("totalTextField", root);
    }

    public com.codename1.ui.TextField findTotalTextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("totalTextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("totalTextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findAsrContainer(Component root) {
        return (com.codename1.ui.Container)findByName("asrContainer", root);
    }

    public com.codename1.ui.Container findAsrContainer() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("asrContainer", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("asrContainer", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findCapTableSeriesAButton(Component root) {
        return (com.codename1.ui.Button)findByName("capTableSeriesAButton", root);
    }

    public com.codename1.ui.Button findCapTableSeriesAButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("capTableSeriesAButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("capTableSeriesAButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findFounder4TextField(Component root) {
        return (com.codename1.ui.TextField)findByName("founder4TextField", root);
    }

    public com.codename1.ui.TextField findFounder4TextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("founder4TextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("founder4TextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findPsarDiscountTextField(Component root) {
        return (com.codename1.ui.TextField)findByName("psarDiscountTextField", root);
    }

    public com.codename1.ui.TextField findPsarDiscountTextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("psarDiscountTextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("psarDiscountTextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findFfr2ValuationTextField(Component root) {
        return (com.codename1.ui.TextField)findByName("ffr2ValuationTextField", root);
    }

    public com.codename1.ui.TextField findFfr2ValuationTextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("ffr2ValuationTextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("ffr2ValuationTextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findSarRaise2TextField(Component root) {
        return (com.codename1.ui.TextField)findByName("sarRaise2TextField", root);
    }

    public com.codename1.ui.TextField findSarRaise2TextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("sarRaise2TextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("sarRaise2TextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findYearFoundedTextField(Component root) {
        return (com.codename1.ui.TextField)findByName("yearFoundedTextField", root);
    }

    public com.codename1.ui.TextField findYearFoundedTextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("yearFoundedTextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("yearFoundedTextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findEmployeeTextField(Component root) {
        return (com.codename1.ui.TextField)findByName("employeeTextField", root);
    }

    public com.codename1.ui.TextField findEmployeeTextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("employeeTextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("employeeTextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findTotalPercentTextField(Component root) {
        return (com.codename1.ui.TextField)findByName("totalPercentTextField", root);
    }

    public com.codename1.ui.TextField findTotalPercentTextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("totalPercentTextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("totalPercentTextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findSharesTextField(Component root) {
        return (com.codename1.ui.TextField)findByName("sharesTextField", root);
    }

    public com.codename1.ui.TextField findSharesTextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("sharesTextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("sharesTextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findSarPercentage2TextField(Component root) {
        return (com.codename1.ui.TextField)findByName("sarPercentage2TextField", root);
    }

    public com.codename1.ui.TextField findSarPercentage2TextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("sarPercentage2TextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("sarPercentage2TextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findSarValuation3TextField(Component root) {
        return (com.codename1.ui.TextField)findByName("sarValuation3TextField", root);
    }

    public com.codename1.ui.TextField findSarValuation3TextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("sarValuation3TextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("sarValuation3TextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findAboutTextArea(Component root) {
        return (com.codename1.ui.TextArea)findByName("aboutTextArea", root);
    }

    public com.codename1.ui.TextArea findAboutTextArea() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("aboutTextArea", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("aboutTextArea", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findSarName2TextField(Component root) {
        return (com.codename1.ui.TextField)findByName("sarName2TextField", root);
    }

    public com.codename1.ui.TextField findSarName2TextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("sarName2TextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("sarName2TextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel21(Component root) {
        return (com.codename1.ui.Label)findByName("Label21", root);
    }

    public com.codename1.ui.Label findLabel21() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label21", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label21", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findSarDividend3TextField(Component root) {
        return (com.codename1.ui.TextField)findByName("sarDividend3TextField", root);
    }

    public com.codename1.ui.TextField findSarDividend3TextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("sarDividend3TextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("sarDividend3TextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findFounder1TextField(Component root) {
        return (com.codename1.ui.TextField)findByName("founder1TextField", root);
    }

    public com.codename1.ui.TextField findFounder1TextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("founder1TextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("founder1TextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findSarPref1TextField(Component root) {
        return (com.codename1.ui.TextField)findByName("sarPref1TextField", root);
    }

    public com.codename1.ui.TextField findSarPref1TextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("sarPref1TextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("sarPref1TextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findCapTableFoundersButton(Component root) {
        return (com.codename1.ui.Button)findByName("capTableFoundersButton", root);
    }

    public com.codename1.ui.Button findCapTableFoundersButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("capTableFoundersButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("capTableFoundersButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel211(Component root) {
        return (com.codename1.ui.Label)findByName("Label211", root);
    }

    public com.codename1.ui.Label findLabel211() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label211", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label211", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findAngelSeedButton(Component root) {
        return (com.codename1.ui.Button)findByName("angelSeedButton", root);
    }

    public com.codename1.ui.Button findAngelSeedButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("angelSeedButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("angelSeedButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findFounder2PercentTextField(Component root) {
        return (com.codename1.ui.TextField)findByName("founder2PercentTextField", root);
    }

    public com.codename1.ui.TextField findFounder2PercentTextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("founder2PercentTextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("founder2PercentTextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findFounder6TextField(Component root) {
        return (com.codename1.ui.TextField)findByName("founder6TextField", root);
    }

    public com.codename1.ui.TextField findFounder6TextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("founder6TextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("founder6TextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findFfr2DiscountTextField(Component root) {
        return (com.codename1.ui.TextField)findByName("ffr2DiscountTextField", root);
    }

    public com.codename1.ui.TextField findFfr2DiscountTextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("ffr2DiscountTextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("ffr2DiscountTextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findFounder5PercentTextField(Component root) {
        return (com.codename1.ui.TextField)findByName("founder5PercentTextField", root);
    }

    public com.codename1.ui.TextField findFounder5PercentTextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("founder5PercentTextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("founder5PercentTextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findFfr1RaisedTextField(Component root) {
        return (com.codename1.ui.TextField)findByName("ffr1RaisedTextField", root);
    }

    public com.codename1.ui.TextField findFfr1RaisedTextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("ffr1RaisedTextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("ffr1RaisedTextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Tabs findCapsTableTabs(Component root) {
        return (com.codename1.ui.Tabs)findByName("capsTableTabs", root);
    }

    public com.codename1.ui.Tabs findCapsTableTabs() {
        com.codename1.ui.Tabs cmp = (com.codename1.ui.Tabs)findByName("capsTableTabs", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Tabs)findByName("capsTableTabs", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findSarSetButton(Component root) {
        return (com.codename1.ui.Button)findByName("sarSetButton", root);
    }

    public com.codename1.ui.Button findSarSetButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("sarSetButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("sarSetButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel11(Component root) {
        return (com.codename1.ui.Label)findByName("Label11", root);
    }

    public com.codename1.ui.Label findLabel11() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label11", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label11", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findFounder2TextField(Component root) {
        return (com.codename1.ui.TextField)findByName("founder2TextField", root);
    }

    public com.codename1.ui.TextField findFounder2TextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("founder2TextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("founder2TextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findAsrNameTextField(Component root) {
        return (com.codename1.ui.TextField)findByName("asrNameTextField", root);
    }

    public com.codename1.ui.TextField findAsrNameTextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("asrNameTextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("asrNameTextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findExitYearTextField(Component root) {
        return (com.codename1.ui.TextField)findByName("exitYearTextField", root);
    }

    public com.codename1.ui.TextField findExitYearTextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("exitYearTextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("exitYearTextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findSarRaise3TextField(Component root) {
        return (com.codename1.ui.TextField)findByName("sarRaise3TextField", root);
    }

    public com.codename1.ui.TextField findSarRaise3TextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("sarRaise3TextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("sarRaise3TextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findPsarValutationTextField(Component root) {
        return (com.codename1.ui.TextField)findByName("psarValutationTextField", root);
    }

    public com.codename1.ui.TextField findPsarValutationTextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("psarValutationTextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("psarValutationTextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findAsrValuationTextField(Component root) {
        return (com.codename1.ui.TextField)findByName("asrValuationTextField", root);
    }

    public com.codename1.ui.TextField findAsrValuationTextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("asrValuationTextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("asrValuationTextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel(Component root) {
        return (com.codename1.ui.Label)findByName("Label", root);
    }

    public com.codename1.ui.Label findLabel() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer3(Component root) {
        return (com.codename1.ui.Container)findByName("Container3", root);
    }

    public com.codename1.ui.Container findContainer3() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container3", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container3", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer4(Component root) {
        return (com.codename1.ui.Container)findByName("Container4", root);
    }

    public com.codename1.ui.Container findContainer4() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container4", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container4", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer1(Component root) {
        return (com.codename1.ui.Container)findByName("Container1", root);
    }

    public com.codename1.ui.Container findContainer1() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer2(Component root) {
        return (com.codename1.ui.Container)findByName("Container2", root);
    }

    public com.codename1.ui.Container findContainer2() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findCapTableAngelSeedButton(Component root) {
        return (com.codename1.ui.Button)findByName("capTableAngelSeedButton", root);
    }

    public com.codename1.ui.Button findCapTableAngelSeedButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("capTableAngelSeedButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("capTableAngelSeedButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer5(Component root) {
        return (com.codename1.ui.Container)findByName("Container5", root);
    }

    public com.codename1.ui.Container findContainer5() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container5", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container5", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findSarPref2TextField(Component root) {
        return (com.codename1.ui.TextField)findByName("sarPref2TextField", root);
    }

    public com.codename1.ui.TextField findSarPref2TextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("sarPref2TextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("sarPref2TextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer(Component root) {
        return (com.codename1.ui.Container)findByName("Container", root);
    }

    public com.codename1.ui.Container findContainer() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findFfr2SetButton(Component root) {
        return (com.codename1.ui.Button)findByName("ffr2SetButton", root);
    }

    public com.codename1.ui.Button findFfr2SetButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("ffr2SetButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("ffr2SetButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Tabs findTabs1(Component root) {
        return (com.codename1.ui.Tabs)findByName("Tabs1", root);
    }

    public com.codename1.ui.Tabs findTabs1() {
        com.codename1.ui.Tabs cmp = (com.codename1.ui.Tabs)findByName("Tabs1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Tabs)findByName("Tabs1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findSarName3TextField(Component root) {
        return (com.codename1.ui.TextField)findByName("sarName3TextField", root);
    }

    public com.codename1.ui.TextField findSarName3TextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("sarName3TextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("sarName3TextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findFfr1ValuationTextField(Component root) {
        return (com.codename1.ui.TextField)findByName("ffr1ValuationTextField", root);
    }

    public com.codename1.ui.TextField findFfr1ValuationTextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("ffr1ValuationTextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("ffr1ValuationTextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findCapTableFriendFamilyButton(Component root) {
        return (com.codename1.ui.Button)findByName("capTableFriendFamilyButton", root);
    }

    public com.codename1.ui.Button findCapTableFriendFamilyButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("capTableFriendFamilyButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("capTableFriendFamilyButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.SpanLabel findSpanLabel(Component root) {
        return (com.codename1.components.SpanLabel)findByName("SpanLabel", root);
    }

    public com.codename1.components.SpanLabel findSpanLabel() {
        com.codename1.components.SpanLabel cmp = (com.codename1.components.SpanLabel)findByName("SpanLabel", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.SpanLabel)findByName("SpanLabel", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel111(Component root) {
        return (com.codename1.ui.Label)findByName("Label111", root);
    }

    public com.codename1.ui.Label findLabel111() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label111", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label111", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findEmployeePercentTextField(Component root) {
        return (com.codename1.ui.TextField)findByName("employeePercentTextField", root);
    }

    public com.codename1.ui.TextField findEmployeePercentTextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("employeePercentTextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("employeePercentTextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findSeriesAButton(Component root) {
        return (com.codename1.ui.Button)findByName("seriesAButton", root);
    }

    public com.codename1.ui.Button findSeriesAButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("seriesAButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("seriesAButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findAsrDividendTextField(Component root) {
        return (com.codename1.ui.TextField)findByName("asrDividendTextField", root);
    }

    public com.codename1.ui.TextField findAsrDividendTextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("asrDividendTextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("asrDividendTextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findFfr1SetButton(Component root) {
        return (com.codename1.ui.Button)findByName("ffr1SetButton", root);
    }

    public com.codename1.ui.Button findFfr1SetButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("ffr1SetButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("ffr1SetButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Tabs findTabs(Component root) {
        return (com.codename1.ui.Tabs)findByName("Tabs", root);
    }

    public com.codename1.ui.Tabs findTabs() {
        com.codename1.ui.Tabs cmp = (com.codename1.ui.Tabs)findByName("Tabs", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Tabs)findByName("Tabs", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findFfr1YearTextField(Component root) {
        return (com.codename1.ui.TextField)findByName("ffr1YearTextField", root);
    }

    public com.codename1.ui.TextField findFfr1YearTextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("ffr1YearTextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("ffr1YearTextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findFoundersButton(Component root) {
        return (com.codename1.ui.Button)findByName("foundersButton", root);
    }

    public com.codename1.ui.Button findFoundersButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("foundersButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("foundersButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findFounder3TextField(Component root) {
        return (com.codename1.ui.TextField)findByName("founder3TextField", root);
    }

    public com.codename1.ui.TextField findFounder3TextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("founder3TextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("founder3TextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findSarPref3TextField(Component root) {
        return (com.codename1.ui.TextField)findByName("sarPref3TextField", root);
    }

    public com.codename1.ui.TextField findSarPref3TextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("sarPref3TextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("sarPref3TextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findAsrYearTextField(Component root) {
        return (com.codename1.ui.TextField)findByName("asrYearTextField", root);
    }

    public com.codename1.ui.TextField findAsrYearTextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("asrYearTextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("asrYearTextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findAsrPercentageTextField(Component root) {
        return (com.codename1.ui.TextField)findByName("asrPercentageTextField", root);
    }

    public com.codename1.ui.TextField findAsrPercentageTextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("asrPercentageTextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("asrPercentageTextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findPsarRaisedTextField(Component root) {
        return (com.codename1.ui.TextField)findByName("psarRaisedTextField", root);
    }

    public com.codename1.ui.TextField findPsarRaisedTextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("psarRaisedTextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("psarRaisedTextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findFounder4PercentTextField(Component root) {
        return (com.codename1.ui.TextField)findByName("founder4PercentTextField", root);
    }

    public com.codename1.ui.TextField findFounder4PercentTextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("founder4PercentTextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("founder4PercentTextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findFounder1PercentTextField(Component root) {
        return (com.codename1.ui.TextField)findByName("founder1PercentTextField", root);
    }

    public com.codename1.ui.TextField findFounder1PercentTextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("founder1PercentTextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("founder1PercentTextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findSarName1TextField(Component root) {
        return (com.codename1.ui.TextField)findByName("sarName1TextField", root);
    }

    public com.codename1.ui.TextField findSarName1TextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("sarName1TextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("sarName1TextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findFriendsFamily1Button(Component root) {
        return (com.codename1.ui.Button)findByName("friendsFamily1Button", root);
    }

    public com.codename1.ui.Button findFriendsFamily1Button() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("friendsFamily1Button", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("friendsFamily1Button", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findPsarEquityTextField(Component root) {
        return (com.codename1.ui.TextField)findByName("psarEquityTextField", root);
    }

    public com.codename1.ui.TextField findPsarEquityTextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("psarEquityTextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("psarEquityTextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findSarPercentage1TextField(Component root) {
        return (com.codename1.ui.TextField)findByName("sarPercentage1TextField", root);
    }

    public com.codename1.ui.TextField findSarPercentage1TextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("sarPercentage1TextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("sarPercentage1TextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findFfr1DiscountTextField(Component root) {
        return (com.codename1.ui.TextField)findByName("ffr1DiscountTextField", root);
    }

    public com.codename1.ui.TextField findFfr1DiscountTextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("ffr1DiscountTextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("ffr1DiscountTextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findViewWaterfallButton(Component root) {
        return (com.codename1.ui.Button)findByName("viewWaterfallButton", root);
    }

    public com.codename1.ui.Button findViewWaterfallButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("viewWaterfallButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("viewWaterfallButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findFounder1Label(Component root) {
        return (com.codename1.ui.Label)findByName("founder1Label", root);
    }

    public com.codename1.ui.Label findFounder1Label() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("founder1Label", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("founder1Label", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findFfr2EquityTextField(Component root) {
        return (com.codename1.ui.TextField)findByName("ffr2EquityTextField", root);
    }

    public com.codename1.ui.TextField findFfr2EquityTextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("ffr2EquityTextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("ffr2EquityTextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findSarValuation2TextField(Component root) {
        return (com.codename1.ui.TextField)findByName("sarValuation2TextField", root);
    }

    public com.codename1.ui.TextField findSarValuation2TextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("sarValuation2TextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("sarValuation2TextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findFrContainer(Component root) {
        return (com.codename1.ui.Container)findByName("frContainer", root);
    }

    public com.codename1.ui.Container findFrContainer() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("frContainer", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("frContainer", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.SpanLabel findSpanLabel111(Component root) {
        return (com.codename1.components.SpanLabel)findByName("SpanLabel111", root);
    }

    public com.codename1.components.SpanLabel findSpanLabel111() {
        com.codename1.components.SpanLabel cmp = (com.codename1.components.SpanLabel)findByName("SpanLabel111", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.SpanLabel)findByName("SpanLabel111", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel5(Component root) {
        return (com.codename1.ui.Label)findByName("Label5", root);
    }

    public com.codename1.ui.Label findLabel5() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label5", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label5", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel4(Component root) {
        return (com.codename1.ui.Label)findByName("Label4", root);
    }

    public com.codename1.ui.Label findLabel4() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label4", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label4", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findSarContainer(Component root) {
        return (com.codename1.ui.Container)findByName("sarContainer", root);
    }

    public com.codename1.ui.Container findSarContainer() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("sarContainer", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("sarContainer", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findEmployeeLabel(Component root) {
        return (com.codename1.ui.Label)findByName("employeeLabel", root);
    }

    public com.codename1.ui.Label findEmployeeLabel() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("employeeLabel", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("employeeLabel", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findFriendsFamily2Button(Component root) {
        return (com.codename1.ui.Button)findByName("friendsFamily2Button", root);
    }

    public com.codename1.ui.Button findFriendsFamily2Button() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("friendsFamily2Button", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("friendsFamily2Button", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findPsarNameTextField(Component root) {
        return (com.codename1.ui.TextField)findByName("psarNameTextField", root);
    }

    public com.codename1.ui.TextField findPsarNameTextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("psarNameTextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("psarNameTextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel1(Component root) {
        return (com.codename1.ui.Label)findByName("Label1", root);
    }

    public com.codename1.ui.Label findLabel1() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findSetFoundersInputButton(Component root) {
        return (com.codename1.ui.Button)findByName("setFoundersInputButton", root);
    }

    public com.codename1.ui.Button findSetFoundersInputButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("setFoundersInputButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("setFoundersInputButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel3(Component root) {
        return (com.codename1.ui.Label)findByName("Label3", root);
    }

    public com.codename1.ui.Label findLabel3() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label3", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label3", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel2(Component root) {
        return (com.codename1.ui.Label)findByName("Label2", root);
    }

    public com.codename1.ui.Label findLabel2() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findPreSeriesAButton(Component root) {
        return (com.codename1.ui.Button)findByName("preSeriesAButton", root);
    }

    public com.codename1.ui.Button findPreSeriesAButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("preSeriesAButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("preSeriesAButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findTotalLabel(Component root) {
        return (com.codename1.ui.Label)findByName("totalLabel", root);
    }

    public com.codename1.ui.Label findTotalLabel() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("totalLabel", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("totalLabel", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findAsrRaiseTextField(Component root) {
        return (com.codename1.ui.TextField)findByName("asrRaiseTextField", root);
    }

    public com.codename1.ui.TextField findAsrRaiseTextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("asrRaiseTextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("asrRaiseTextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.SpanLabel findSpanLabel1(Component root) {
        return (com.codename1.components.SpanLabel)findByName("SpanLabel1", root);
    }

    public com.codename1.components.SpanLabel findSpanLabel1() {
        com.codename1.components.SpanLabel cmp = (com.codename1.components.SpanLabel)findByName("SpanLabel1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.SpanLabel)findByName("SpanLabel1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findFfr2RaisedTextField(Component root) {
        return (com.codename1.ui.TextField)findByName("ffr2RaisedTextField", root);
    }

    public com.codename1.ui.TextField findFfr2RaisedTextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("ffr2RaisedTextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("ffr2RaisedTextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findAsrSetButton(Component root) {
        return (com.codename1.ui.Button)findByName("asrSetButton", root);
    }

    public com.codename1.ui.Button findAsrSetButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("asrSetButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("asrSetButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findSarDividend2TextField(Component root) {
        return (com.codename1.ui.TextField)findByName("sarDividend2TextField", root);
    }

    public com.codename1.ui.TextField findSarDividend2TextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("sarDividend2TextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("sarDividend2TextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findBuyoutTextField(Component root) {
        return (com.codename1.ui.TextField)findByName("buyoutTextField", root);
    }

    public com.codename1.ui.TextField findBuyoutTextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("buyoutTextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("buyoutTextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.SpanLabel findSpanLabel2(Component root) {
        return (com.codename1.components.SpanLabel)findByName("SpanLabel2", root);
    }

    public com.codename1.components.SpanLabel findSpanLabel2() {
        com.codename1.components.SpanLabel cmp = (com.codename1.components.SpanLabel)findByName("SpanLabel2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.SpanLabel)findByName("SpanLabel2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.SpanLabel findSpanLabel3(Component root) {
        return (com.codename1.components.SpanLabel)findByName("SpanLabel3", root);
    }

    public com.codename1.components.SpanLabel findSpanLabel3() {
        com.codename1.components.SpanLabel cmp = (com.codename1.components.SpanLabel)findByName("SpanLabel3", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.SpanLabel)findByName("SpanLabel3", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findSarPercentage3TextField(Component root) {
        return (com.codename1.ui.TextField)findByName("sarPercentage3TextField", root);
    }

    public com.codename1.ui.TextField findSarPercentage3TextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("sarPercentage3TextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("sarPercentage3TextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public static final int COMMAND_MainFOUNDERSEMPLOYEEOPTIONS = 2;
    public static final int COMMAND_MainPRESERIESAROUND = 6;
    public static final int COMMAND_MainFRIENDSFAMILYROUND1 = 3;
    public static final int COMMAND_MainFRIENDSFAMILYROUND2 = 4;
    public static final int COMMAND_MainVIEW = 8;
    public static final int COMMAND_MainSERIESAROUND = 7;
    public static final int COMMAND_MainANGELSEEDROUND = 5;

    protected boolean onMainFOUNDERSEMPLOYEEOPTIONS() {
        return false;
    }

    protected boolean onMainPRESERIESAROUND() {
        return false;
    }

    protected boolean onMainFRIENDSFAMILYROUND1() {
        return false;
    }

    protected boolean onMainFRIENDSFAMILYROUND2() {
        return false;
    }

    protected boolean onMainVIEW() {
        return false;
    }

    protected boolean onMainSERIESAROUND() {
        return false;
    }

    protected boolean onMainANGELSEEDROUND() {
        return false;
    }

    protected void processCommand(ActionEvent ev, Command cmd) {
        switch(cmd.getId()) {
            case COMMAND_MainFOUNDERSEMPLOYEEOPTIONS:
                if(onMainFOUNDERSEMPLOYEEOPTIONS()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_MainPRESERIESAROUND:
                if(onMainPRESERIESAROUND()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_MainFRIENDSFAMILYROUND1:
                if(onMainFRIENDSFAMILYROUND1()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_MainFRIENDSFAMILYROUND2:
                if(onMainFRIENDSFAMILYROUND2()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_MainVIEW:
                if(onMainVIEW()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_MainSERIESAROUND:
                if(onMainSERIESAROUND()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_MainANGELSEEDROUND:
                if(onMainANGELSEEDROUND()) {
                    ev.consume();
                    return;
                }
                break;

        }
        if(ev.getComponent() != null) {
            handleComponentAction(ev.getComponent(), ev);
        }
    }

    protected void exitForm(Form f) {
        if("FriendsFamilyRound2Form".equals(f.getName())) {
            exitFriendsFamilyRound2Form(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("PreSeriesAForm".equals(f.getName())) {
            exitPreSeriesAForm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("FounderRoundForm".equals(f.getName())) {
            exitFounderRoundForm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("FriendsFamilyRound1Form".equals(f.getName())) {
            exitFriendsFamilyRound1Form(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("CapsTableForm".equals(f.getName())) {
            exitCapsTableForm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("DataListForm".equals(f.getName())) {
            exitDataListForm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("SeriesAForm".equals(f.getName())) {
            exitSeriesAForm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("AngelSeedRoundForm".equals(f.getName())) {
            exitAngelSeedRoundForm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("WaterfallForm".equals(f.getName())) {
            exitWaterfallForm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            exitMain(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void exitFriendsFamilyRound2Form(Form f) {
    }


    protected void exitPreSeriesAForm(Form f) {
    }


    protected void exitFounderRoundForm(Form f) {
    }


    protected void exitFriendsFamilyRound1Form(Form f) {
    }


    protected void exitCapsTableForm(Form f) {
    }


    protected void exitDataListForm(Form f) {
    }


    protected void exitSeriesAForm(Form f) {
    }


    protected void exitAngelSeedRoundForm(Form f) {
    }


    protected void exitWaterfallForm(Form f) {
    }


    protected void exitMain(Form f) {
    }

    protected void beforeShow(Form f) {
    aboutToShowThisContainer = f;
        if("FriendsFamilyRound2Form".equals(f.getName())) {
            beforeFriendsFamilyRound2Form(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("PreSeriesAForm".equals(f.getName())) {
            beforePreSeriesAForm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("FounderRoundForm".equals(f.getName())) {
            beforeFounderRoundForm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("FriendsFamilyRound1Form".equals(f.getName())) {
            beforeFriendsFamilyRound1Form(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("CapsTableForm".equals(f.getName())) {
            beforeCapsTableForm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("DataListForm".equals(f.getName())) {
            beforeDataListForm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("SeriesAForm".equals(f.getName())) {
            beforeSeriesAForm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("AngelSeedRoundForm".equals(f.getName())) {
            beforeAngelSeedRoundForm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("WaterfallForm".equals(f.getName())) {
            beforeWaterfallForm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            beforeMain(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforeFriendsFamilyRound2Form(Form f) {
    }


    protected void beforePreSeriesAForm(Form f) {
    }


    protected void beforeFounderRoundForm(Form f) {
    }


    protected void beforeFriendsFamilyRound1Form(Form f) {
    }


    protected void beforeCapsTableForm(Form f) {
    }


    protected void beforeDataListForm(Form f) {
    }


    protected void beforeSeriesAForm(Form f) {
    }


    protected void beforeAngelSeedRoundForm(Form f) {
    }


    protected void beforeWaterfallForm(Form f) {
    }


    protected void beforeMain(Form f) {
    }

    protected void beforeShowContainer(Container c) {
        aboutToShowThisContainer = c;
        if("FriendsFamilyRound2Form".equals(c.getName())) {
            beforeContainerFriendsFamilyRound2Form(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("PreSeriesAForm".equals(c.getName())) {
            beforeContainerPreSeriesAForm(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("FounderRoundForm".equals(c.getName())) {
            beforeContainerFounderRoundForm(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("FriendsFamilyRound1Form".equals(c.getName())) {
            beforeContainerFriendsFamilyRound1Form(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("CapsTableForm".equals(c.getName())) {
            beforeContainerCapsTableForm(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("DataListForm".equals(c.getName())) {
            beforeContainerDataListForm(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("SeriesAForm".equals(c.getName())) {
            beforeContainerSeriesAForm(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("AngelSeedRoundForm".equals(c.getName())) {
            beforeContainerAngelSeedRoundForm(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("WaterfallForm".equals(c.getName())) {
            beforeContainerWaterfallForm(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(c.getName())) {
            beforeContainerMain(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforeContainerFriendsFamilyRound2Form(Container c) {
    }


    protected void beforeContainerPreSeriesAForm(Container c) {
    }


    protected void beforeContainerFounderRoundForm(Container c) {
    }


    protected void beforeContainerFriendsFamilyRound1Form(Container c) {
    }


    protected void beforeContainerCapsTableForm(Container c) {
    }


    protected void beforeContainerDataListForm(Container c) {
    }


    protected void beforeContainerSeriesAForm(Container c) {
    }


    protected void beforeContainerAngelSeedRoundForm(Container c) {
    }


    protected void beforeContainerWaterfallForm(Container c) {
    }


    protected void beforeContainerMain(Container c) {
    }

    protected void postShow(Form f) {
        if("FriendsFamilyRound2Form".equals(f.getName())) {
            postFriendsFamilyRound2Form(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("PreSeriesAForm".equals(f.getName())) {
            postPreSeriesAForm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("FounderRoundForm".equals(f.getName())) {
            postFounderRoundForm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("FriendsFamilyRound1Form".equals(f.getName())) {
            postFriendsFamilyRound1Form(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("CapsTableForm".equals(f.getName())) {
            postCapsTableForm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("DataListForm".equals(f.getName())) {
            postDataListForm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("SeriesAForm".equals(f.getName())) {
            postSeriesAForm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("AngelSeedRoundForm".equals(f.getName())) {
            postAngelSeedRoundForm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("WaterfallForm".equals(f.getName())) {
            postWaterfallForm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            postMain(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postFriendsFamilyRound2Form(Form f) {
    }


    protected void postPreSeriesAForm(Form f) {
    }


    protected void postFounderRoundForm(Form f) {
    }


    protected void postFriendsFamilyRound1Form(Form f) {
    }


    protected void postCapsTableForm(Form f) {
    }


    protected void postDataListForm(Form f) {
    }


    protected void postSeriesAForm(Form f) {
    }


    protected void postAngelSeedRoundForm(Form f) {
    }


    protected void postWaterfallForm(Form f) {
    }


    protected void postMain(Form f) {
    }

    protected void postShowContainer(Container c) {
        if("FriendsFamilyRound2Form".equals(c.getName())) {
            postContainerFriendsFamilyRound2Form(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("PreSeriesAForm".equals(c.getName())) {
            postContainerPreSeriesAForm(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("FounderRoundForm".equals(c.getName())) {
            postContainerFounderRoundForm(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("FriendsFamilyRound1Form".equals(c.getName())) {
            postContainerFriendsFamilyRound1Form(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("CapsTableForm".equals(c.getName())) {
            postContainerCapsTableForm(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("DataListForm".equals(c.getName())) {
            postContainerDataListForm(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("SeriesAForm".equals(c.getName())) {
            postContainerSeriesAForm(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("AngelSeedRoundForm".equals(c.getName())) {
            postContainerAngelSeedRoundForm(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("WaterfallForm".equals(c.getName())) {
            postContainerWaterfallForm(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(c.getName())) {
            postContainerMain(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postContainerFriendsFamilyRound2Form(Container c) {
    }


    protected void postContainerPreSeriesAForm(Container c) {
    }


    protected void postContainerFounderRoundForm(Container c) {
    }


    protected void postContainerFriendsFamilyRound1Form(Container c) {
    }


    protected void postContainerCapsTableForm(Container c) {
    }


    protected void postContainerDataListForm(Container c) {
    }


    protected void postContainerSeriesAForm(Container c) {
    }


    protected void postContainerAngelSeedRoundForm(Container c) {
    }


    protected void postContainerWaterfallForm(Container c) {
    }


    protected void postContainerMain(Container c) {
    }

    protected void onCreateRoot(String rootName) {
        if("FriendsFamilyRound2Form".equals(rootName)) {
            onCreateFriendsFamilyRound2Form();
            aboutToShowThisContainer = null;
            return;
        }

        if("PreSeriesAForm".equals(rootName)) {
            onCreatePreSeriesAForm();
            aboutToShowThisContainer = null;
            return;
        }

        if("FounderRoundForm".equals(rootName)) {
            onCreateFounderRoundForm();
            aboutToShowThisContainer = null;
            return;
        }

        if("FriendsFamilyRound1Form".equals(rootName)) {
            onCreateFriendsFamilyRound1Form();
            aboutToShowThisContainer = null;
            return;
        }

        if("CapsTableForm".equals(rootName)) {
            onCreateCapsTableForm();
            aboutToShowThisContainer = null;
            return;
        }

        if("DataListForm".equals(rootName)) {
            onCreateDataListForm();
            aboutToShowThisContainer = null;
            return;
        }

        if("SeriesAForm".equals(rootName)) {
            onCreateSeriesAForm();
            aboutToShowThisContainer = null;
            return;
        }

        if("AngelSeedRoundForm".equals(rootName)) {
            onCreateAngelSeedRoundForm();
            aboutToShowThisContainer = null;
            return;
        }

        if("WaterfallForm".equals(rootName)) {
            onCreateWaterfallForm();
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(rootName)) {
            onCreateMain();
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void onCreateFriendsFamilyRound2Form() {
    }


    protected void onCreatePreSeriesAForm() {
    }


    protected void onCreateFounderRoundForm() {
    }


    protected void onCreateFriendsFamilyRound1Form() {
    }


    protected void onCreateCapsTableForm() {
    }


    protected void onCreateDataListForm() {
    }


    protected void onCreateSeriesAForm() {
    }


    protected void onCreateAngelSeedRoundForm() {
    }


    protected void onCreateWaterfallForm() {
    }


    protected void onCreateMain() {
    }

    protected Hashtable getFormState(Form f) {
        Hashtable h = super.getFormState(f);
        if("FriendsFamilyRound2Form".equals(f.getName())) {
            getStateFriendsFamilyRound2Form(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("PreSeriesAForm".equals(f.getName())) {
            getStatePreSeriesAForm(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("FounderRoundForm".equals(f.getName())) {
            getStateFounderRoundForm(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("FriendsFamilyRound1Form".equals(f.getName())) {
            getStateFriendsFamilyRound1Form(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("CapsTableForm".equals(f.getName())) {
            getStateCapsTableForm(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("DataListForm".equals(f.getName())) {
            getStateDataListForm(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("SeriesAForm".equals(f.getName())) {
            getStateSeriesAForm(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("AngelSeedRoundForm".equals(f.getName())) {
            getStateAngelSeedRoundForm(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("WaterfallForm".equals(f.getName())) {
            getStateWaterfallForm(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Main".equals(f.getName())) {
            getStateMain(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

            return h;
    }


    protected void getStateFriendsFamilyRound2Form(Form f, Hashtable h) {
    }


    protected void getStatePreSeriesAForm(Form f, Hashtable h) {
    }


    protected void getStateFounderRoundForm(Form f, Hashtable h) {
    }


    protected void getStateFriendsFamilyRound1Form(Form f, Hashtable h) {
    }


    protected void getStateCapsTableForm(Form f, Hashtable h) {
    }


    protected void getStateDataListForm(Form f, Hashtable h) {
    }


    protected void getStateSeriesAForm(Form f, Hashtable h) {
    }


    protected void getStateAngelSeedRoundForm(Form f, Hashtable h) {
    }


    protected void getStateWaterfallForm(Form f, Hashtable h) {
    }


    protected void getStateMain(Form f, Hashtable h) {
    }

    protected void setFormState(Form f, Hashtable state) {
        super.setFormState(f, state);
        if("FriendsFamilyRound2Form".equals(f.getName())) {
            setStateFriendsFamilyRound2Form(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("PreSeriesAForm".equals(f.getName())) {
            setStatePreSeriesAForm(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("FounderRoundForm".equals(f.getName())) {
            setStateFounderRoundForm(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("FriendsFamilyRound1Form".equals(f.getName())) {
            setStateFriendsFamilyRound1Form(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("CapsTableForm".equals(f.getName())) {
            setStateCapsTableForm(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("DataListForm".equals(f.getName())) {
            setStateDataListForm(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("SeriesAForm".equals(f.getName())) {
            setStateSeriesAForm(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("AngelSeedRoundForm".equals(f.getName())) {
            setStateAngelSeedRoundForm(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("WaterfallForm".equals(f.getName())) {
            setStateWaterfallForm(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            setStateMain(f, state);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void setStateFriendsFamilyRound2Form(Form f, Hashtable state) {
    }


    protected void setStatePreSeriesAForm(Form f, Hashtable state) {
    }


    protected void setStateFounderRoundForm(Form f, Hashtable state) {
    }


    protected void setStateFriendsFamilyRound1Form(Form f, Hashtable state) {
    }


    protected void setStateCapsTableForm(Form f, Hashtable state) {
    }


    protected void setStateDataListForm(Form f, Hashtable state) {
    }


    protected void setStateSeriesAForm(Form f, Hashtable state) {
    }


    protected void setStateAngelSeedRoundForm(Form f, Hashtable state) {
    }


    protected void setStateWaterfallForm(Form f, Hashtable state) {
    }


    protected void setStateMain(Form f, Hashtable state) {
    }

    protected void handleComponentAction(Component c, ActionEvent event) {
        Container rootContainerAncestor = getRootAncestor(c);
        if(rootContainerAncestor == null) return;
        String rootContainerName = rootContainerAncestor.getName();
        Container leadParentContainer = c.getParent().getLeadParent();
        if(leadParentContainer != null && leadParentContainer.getClass() != Container.class) {
            c = c.getParent().getLeadParent();
        }
        if(rootContainerName == null) return;
        if(rootContainerName.equals("FriendsFamilyRound2Form")) {
            if("ffr2YearTextField".equals(c.getName())) {
                onFriendsFamilyRound2Form_Ffr2YearTextFieldAction(c, event);
                return;
            }
            if("ffr2RaisedTextField".equals(c.getName())) {
                onFriendsFamilyRound2Form_Ffr2RaisedTextFieldAction(c, event);
                return;
            }
            if("ffr2DiscountTextField".equals(c.getName())) {
                onFriendsFamilyRound2Form_Ffr2DiscountTextFieldAction(c, event);
                return;
            }
            if("ffr2ValuationTextField".equals(c.getName())) {
                onFriendsFamilyRound2Form_Ffr2ValuationTextFieldAction(c, event);
                return;
            }
            if("ffr2ConversionValuationTextField".equals(c.getName())) {
                onFriendsFamilyRound2Form_Ffr2ConversionValuationTextFieldAction(c, event);
                return;
            }
            if("ffr2EquityTextField".equals(c.getName())) {
                onFriendsFamilyRound2Form_Ffr2EquityTextFieldAction(c, event);
                return;
            }
            if("ffr2SetButton".equals(c.getName())) {
                onFriendsFamilyRound2Form_Ffr2SetButtonAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("PreSeriesAForm")) {
            if("psarNameTextField".equals(c.getName())) {
                onPreSeriesAForm_PsarNameTextFieldAction(c, event);
                return;
            }
            if("psarYearTextField".equals(c.getName())) {
                onPreSeriesAForm_PsarYearTextFieldAction(c, event);
                return;
            }
            if("psarRaisedTextField".equals(c.getName())) {
                onPreSeriesAForm_PsarRaisedTextFieldAction(c, event);
                return;
            }
            if("psarDiscountTextField".equals(c.getName())) {
                onPreSeriesAForm_PsarDiscountTextFieldAction(c, event);
                return;
            }
            if("psarValutationTextField".equals(c.getName())) {
                onPreSeriesAForm_PsarValutationTextFieldAction(c, event);
                return;
            }
            if("psarConversionEvaluationTextField".equals(c.getName())) {
                onPreSeriesAForm_PsarConversionEvaluationTextFieldAction(c, event);
                return;
            }
            if("psarEquityTextField".equals(c.getName())) {
                onPreSeriesAForm_PsarEquityTextFieldAction(c, event);
                return;
            }
            if("psarSetButton".equals(c.getName())) {
                onPreSeriesAForm_PsarSetButtonAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("FounderRoundForm")) {
            if("sharesTextField".equals(c.getName())) {
                onFounderRoundForm_SharesTextFieldAction(c, event);
                return;
            }
            if("founder1TextField".equals(c.getName())) {
                onFounderRoundForm_Founder1TextFieldAction(c, event);
                return;
            }
            if("founder1PercentTextField".equals(c.getName())) {
                onFounderRoundForm_Founder1PercentTextFieldAction(c, event);
                return;
            }
            if("founder2TextField".equals(c.getName())) {
                onFounderRoundForm_Founder2TextFieldAction(c, event);
                return;
            }
            if("founder2PercentTextField".equals(c.getName())) {
                onFounderRoundForm_Founder2PercentTextFieldAction(c, event);
                return;
            }
            if("founder3TextField".equals(c.getName())) {
                onFounderRoundForm_Founder3TextFieldAction(c, event);
                return;
            }
            if("founder3PercentTextField".equals(c.getName())) {
                onFounderRoundForm_Founder3PercentTextFieldAction(c, event);
                return;
            }
            if("founder4TextField".equals(c.getName())) {
                onFounderRoundForm_Founder4TextFieldAction(c, event);
                return;
            }
            if("founder4PercentTextField".equals(c.getName())) {
                onFounderRoundForm_Founder4PercentTextFieldAction(c, event);
                return;
            }
            if("founder5TextField".equals(c.getName())) {
                onFounderRoundForm_Founder5TextFieldAction(c, event);
                return;
            }
            if("founder5PercentTextField".equals(c.getName())) {
                onFounderRoundForm_Founder5PercentTextFieldAction(c, event);
                return;
            }
            if("founder6TextField".equals(c.getName())) {
                onFounderRoundForm_Founder6TextFieldAction(c, event);
                return;
            }
            if("founder6PercentTextField".equals(c.getName())) {
                onFounderRoundForm_Founder6PercentTextFieldAction(c, event);
                return;
            }
            if("employeeTextField".equals(c.getName())) {
                onFounderRoundForm_EmployeeTextFieldAction(c, event);
                return;
            }
            if("employeePercentTextField".equals(c.getName())) {
                onFounderRoundForm_EmployeePercentTextFieldAction(c, event);
                return;
            }
            if("totalTextField".equals(c.getName())) {
                onFounderRoundForm_TotalTextFieldAction(c, event);
                return;
            }
            if("totalPercentTextField".equals(c.getName())) {
                onFounderRoundForm_TotalPercentTextFieldAction(c, event);
                return;
            }
            if("setFoundersInputButton".equals(c.getName())) {
                onFounderRoundForm_SetFoundersInputButtonAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("FriendsFamilyRound1Form")) {
            if("ffr1YearTextField".equals(c.getName())) {
                onFriendsFamilyRound1Form_Ffr1YearTextFieldAction(c, event);
                return;
            }
            if("ffr1RaisedTextField".equals(c.getName())) {
                onFriendsFamilyRound1Form_Ffr1RaisedTextFieldAction(c, event);
                return;
            }
            if("ffr1DiscountTextField".equals(c.getName())) {
                onFriendsFamilyRound1Form_Ffr1DiscountTextFieldAction(c, event);
                return;
            }
            if("ffr1ValuationTextField".equals(c.getName())) {
                onFriendsFamilyRound1Form_Ffr1ValuationTextFieldAction(c, event);
                return;
            }
            if("ffr1ConversionValuationTextField".equals(c.getName())) {
                onFriendsFamilyRound1Form_Ffr1ConversionValuationTextFieldAction(c, event);
                return;
            }
            if("ffr1EquityTextField".equals(c.getName())) {
                onFriendsFamilyRound1Form_Ffr1EquityTextFieldAction(c, event);
                return;
            }
            if("ffr1SetButton".equals(c.getName())) {
                onFriendsFamilyRound1Form_Ffr1SetButtonAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("SeriesAForm")) {
            if("sarYearTextField".equals(c.getName())) {
                onSeriesAForm_SarYearTextFieldAction(c, event);
                return;
            }
            if("sarName1TextField".equals(c.getName())) {
                onSeriesAForm_SarName1TextFieldAction(c, event);
                return;
            }
            if("sarRaise1TextField".equals(c.getName())) {
                onSeriesAForm_SarRaise1TextFieldAction(c, event);
                return;
            }
            if("sarPercentage1TextField".equals(c.getName())) {
                onSeriesAForm_SarPercentage1TextFieldAction(c, event);
                return;
            }
            if("sarValuation1TextField".equals(c.getName())) {
                onSeriesAForm_SarValuation1TextFieldAction(c, event);
                return;
            }
            if("sarPref1TextField".equals(c.getName())) {
                onSeriesAForm_SarPref1TextFieldAction(c, event);
                return;
            }
            if("sarDividend1TextField".equals(c.getName())) {
                onSeriesAForm_SarDividend1TextFieldAction(c, event);
                return;
            }
            if("sarName2TextField".equals(c.getName())) {
                onSeriesAForm_SarName2TextFieldAction(c, event);
                return;
            }
            if("sarRaise2TextField".equals(c.getName())) {
                onSeriesAForm_SarRaise2TextFieldAction(c, event);
                return;
            }
            if("sarPercentage2TextField".equals(c.getName())) {
                onSeriesAForm_SarPercentage2TextFieldAction(c, event);
                return;
            }
            if("sarValuation2TextField".equals(c.getName())) {
                onSeriesAForm_SarValuation2TextFieldAction(c, event);
                return;
            }
            if("sarPref2TextField".equals(c.getName())) {
                onSeriesAForm_SarPref2TextFieldAction(c, event);
                return;
            }
            if("sarDividend2TextField".equals(c.getName())) {
                onSeriesAForm_SarDividend2TextFieldAction(c, event);
                return;
            }
            if("sarName3TextField".equals(c.getName())) {
                onSeriesAForm_SarName3TextFieldAction(c, event);
                return;
            }
            if("sarRaise3TextField".equals(c.getName())) {
                onSeriesAForm_SarRaise3TextFieldAction(c, event);
                return;
            }
            if("sarPercentage3TextField".equals(c.getName())) {
                onSeriesAForm_SarPercentage3TextFieldAction(c, event);
                return;
            }
            if("sarValuation3TextField".equals(c.getName())) {
                onSeriesAForm_SarValuation3TextFieldAction(c, event);
                return;
            }
            if("sarPref3TextField".equals(c.getName())) {
                onSeriesAForm_SarPref3TextFieldAction(c, event);
                return;
            }
            if("sarDividend3TextField".equals(c.getName())) {
                onSeriesAForm_SarDividend3TextFieldAction(c, event);
                return;
            }
            if("sarSetButton".equals(c.getName())) {
                onSeriesAForm_SarSetButtonAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("AngelSeedRoundForm")) {
            if("asrNameTextField".equals(c.getName())) {
                onAngelSeedRoundForm_AsrNameTextFieldAction(c, event);
                return;
            }
            if("asrYearTextField".equals(c.getName())) {
                onAngelSeedRoundForm_AsrYearTextFieldAction(c, event);
                return;
            }
            if("asrRaiseTextField".equals(c.getName())) {
                onAngelSeedRoundForm_AsrRaiseTextFieldAction(c, event);
                return;
            }
            if("asrPercentageTextField".equals(c.getName())) {
                onAngelSeedRoundForm_AsrPercentageTextFieldAction(c, event);
                return;
            }
            if("asrValuationTextField".equals(c.getName())) {
                onAngelSeedRoundForm_AsrValuationTextFieldAction(c, event);
                return;
            }
            if("asrPrefTextField".equals(c.getName())) {
                onAngelSeedRoundForm_AsrPrefTextFieldAction(c, event);
                return;
            }
            if("asrDividendTextField".equals(c.getName())) {
                onAngelSeedRoundForm_AsrDividendTextFieldAction(c, event);
                return;
            }
            if("asrSetButton".equals(c.getName())) {
                onAngelSeedRoundForm_AsrSetButtonAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Main")) {
            if("foundersButton".equals(c.getName())) {
                onMain_FoundersButtonAction(c, event);
                return;
            }
            if("friendsFamily1Button".equals(c.getName())) {
                onMain_FriendsFamily1ButtonAction(c, event);
                return;
            }
            if("friendsFamily2Button".equals(c.getName())) {
                onMain_FriendsFamily2ButtonAction(c, event);
                return;
            }
            if("angelSeedButton".equals(c.getName())) {
                onMain_AngelSeedButtonAction(c, event);
                return;
            }
            if("preSeriesAButton".equals(c.getName())) {
                onMain_PreSeriesAButtonAction(c, event);
                return;
            }
            if("seriesAButton".equals(c.getName())) {
                onMain_SeriesAButtonAction(c, event);
                return;
            }
            if("capTableFoundersButton".equals(c.getName())) {
                onMain_CapTableFoundersButtonAction(c, event);
                return;
            }
            if("capTableFriendFamilyButton".equals(c.getName())) {
                onMain_CapTableFriendFamilyButtonAction(c, event);
                return;
            }
            if("capTableAngelSeedButton".equals(c.getName())) {
                onMain_CapTableAngelSeedButtonAction(c, event);
                return;
            }
            if("capTableSeriesAButton".equals(c.getName())) {
                onMain_CapTableSeriesAButtonAction(c, event);
                return;
            }
            if("buyoutTextField".equals(c.getName())) {
                onMain_BuyoutTextFieldAction(c, event);
                return;
            }
            if("exitYearTextField".equals(c.getName())) {
                onMain_ExitYearTextFieldAction(c, event);
                return;
            }
            if("viewWaterfallButton".equals(c.getName())) {
                onMain_ViewWaterfallButtonAction(c, event);
                return;
            }
            if("aboutTextArea".equals(c.getName())) {
                onMain_AboutTextAreaAction(c, event);
                return;
            }
            if("companyNameTextField".equals(c.getName())) {
                onMain_CompanyNameTextFieldAction(c, event);
                return;
            }
            if("yearFoundedTextField".equals(c.getName())) {
                onMain_YearFoundedTextFieldAction(c, event);
                return;
            }
        }
    }

      protected void onFriendsFamilyRound2Form_Ffr2YearTextFieldAction(Component c, ActionEvent event) {
      }

      protected void onFriendsFamilyRound2Form_Ffr2RaisedTextFieldAction(Component c, ActionEvent event) {
      }

      protected void onFriendsFamilyRound2Form_Ffr2DiscountTextFieldAction(Component c, ActionEvent event) {
      }

      protected void onFriendsFamilyRound2Form_Ffr2ValuationTextFieldAction(Component c, ActionEvent event) {
      }

      protected void onFriendsFamilyRound2Form_Ffr2ConversionValuationTextFieldAction(Component c, ActionEvent event) {
      }

      protected void onFriendsFamilyRound2Form_Ffr2EquityTextFieldAction(Component c, ActionEvent event) {
      }

      protected void onFriendsFamilyRound2Form_Ffr2SetButtonAction(Component c, ActionEvent event) {
      }

      protected void onPreSeriesAForm_PsarNameTextFieldAction(Component c, ActionEvent event) {
      }

      protected void onPreSeriesAForm_PsarYearTextFieldAction(Component c, ActionEvent event) {
      }

      protected void onPreSeriesAForm_PsarRaisedTextFieldAction(Component c, ActionEvent event) {
      }

      protected void onPreSeriesAForm_PsarDiscountTextFieldAction(Component c, ActionEvent event) {
      }

      protected void onPreSeriesAForm_PsarValutationTextFieldAction(Component c, ActionEvent event) {
      }

      protected void onPreSeriesAForm_PsarConversionEvaluationTextFieldAction(Component c, ActionEvent event) {
      }

      protected void onPreSeriesAForm_PsarEquityTextFieldAction(Component c, ActionEvent event) {
      }

      protected void onPreSeriesAForm_PsarSetButtonAction(Component c, ActionEvent event) {
      }

      protected void onFounderRoundForm_SharesTextFieldAction(Component c, ActionEvent event) {
      }

      protected void onFounderRoundForm_Founder1TextFieldAction(Component c, ActionEvent event) {
      }

      protected void onFounderRoundForm_Founder1PercentTextFieldAction(Component c, ActionEvent event) {
      }

      protected void onFounderRoundForm_Founder2TextFieldAction(Component c, ActionEvent event) {
      }

      protected void onFounderRoundForm_Founder2PercentTextFieldAction(Component c, ActionEvent event) {
      }

      protected void onFounderRoundForm_Founder3TextFieldAction(Component c, ActionEvent event) {
      }

      protected void onFounderRoundForm_Founder3PercentTextFieldAction(Component c, ActionEvent event) {
      }

      protected void onFounderRoundForm_Founder4TextFieldAction(Component c, ActionEvent event) {
      }

      protected void onFounderRoundForm_Founder4PercentTextFieldAction(Component c, ActionEvent event) {
      }

      protected void onFounderRoundForm_Founder5TextFieldAction(Component c, ActionEvent event) {
      }

      protected void onFounderRoundForm_Founder5PercentTextFieldAction(Component c, ActionEvent event) {
      }

      protected void onFounderRoundForm_Founder6TextFieldAction(Component c, ActionEvent event) {
      }

      protected void onFounderRoundForm_Founder6PercentTextFieldAction(Component c, ActionEvent event) {
      }

      protected void onFounderRoundForm_EmployeeTextFieldAction(Component c, ActionEvent event) {
      }

      protected void onFounderRoundForm_EmployeePercentTextFieldAction(Component c, ActionEvent event) {
      }

      protected void onFounderRoundForm_TotalTextFieldAction(Component c, ActionEvent event) {
      }

      protected void onFounderRoundForm_TotalPercentTextFieldAction(Component c, ActionEvent event) {
      }

      protected void onFounderRoundForm_SetFoundersInputButtonAction(Component c, ActionEvent event) {
      }

      protected void onFriendsFamilyRound1Form_Ffr1YearTextFieldAction(Component c, ActionEvent event) {
      }

      protected void onFriendsFamilyRound1Form_Ffr1RaisedTextFieldAction(Component c, ActionEvent event) {
      }

      protected void onFriendsFamilyRound1Form_Ffr1DiscountTextFieldAction(Component c, ActionEvent event) {
      }

      protected void onFriendsFamilyRound1Form_Ffr1ValuationTextFieldAction(Component c, ActionEvent event) {
      }

      protected void onFriendsFamilyRound1Form_Ffr1ConversionValuationTextFieldAction(Component c, ActionEvent event) {
      }

      protected void onFriendsFamilyRound1Form_Ffr1EquityTextFieldAction(Component c, ActionEvent event) {
      }

      protected void onFriendsFamilyRound1Form_Ffr1SetButtonAction(Component c, ActionEvent event) {
      }

      protected void onSeriesAForm_SarYearTextFieldAction(Component c, ActionEvent event) {
      }

      protected void onSeriesAForm_SarName1TextFieldAction(Component c, ActionEvent event) {
      }

      protected void onSeriesAForm_SarRaise1TextFieldAction(Component c, ActionEvent event) {
      }

      protected void onSeriesAForm_SarPercentage1TextFieldAction(Component c, ActionEvent event) {
      }

      protected void onSeriesAForm_SarValuation1TextFieldAction(Component c, ActionEvent event) {
      }

      protected void onSeriesAForm_SarPref1TextFieldAction(Component c, ActionEvent event) {
      }

      protected void onSeriesAForm_SarDividend1TextFieldAction(Component c, ActionEvent event) {
      }

      protected void onSeriesAForm_SarName2TextFieldAction(Component c, ActionEvent event) {
      }

      protected void onSeriesAForm_SarRaise2TextFieldAction(Component c, ActionEvent event) {
      }

      protected void onSeriesAForm_SarPercentage2TextFieldAction(Component c, ActionEvent event) {
      }

      protected void onSeriesAForm_SarValuation2TextFieldAction(Component c, ActionEvent event) {
      }

      protected void onSeriesAForm_SarPref2TextFieldAction(Component c, ActionEvent event) {
      }

      protected void onSeriesAForm_SarDividend2TextFieldAction(Component c, ActionEvent event) {
      }

      protected void onSeriesAForm_SarName3TextFieldAction(Component c, ActionEvent event) {
      }

      protected void onSeriesAForm_SarRaise3TextFieldAction(Component c, ActionEvent event) {
      }

      protected void onSeriesAForm_SarPercentage3TextFieldAction(Component c, ActionEvent event) {
      }

      protected void onSeriesAForm_SarValuation3TextFieldAction(Component c, ActionEvent event) {
      }

      protected void onSeriesAForm_SarPref3TextFieldAction(Component c, ActionEvent event) {
      }

      protected void onSeriesAForm_SarDividend3TextFieldAction(Component c, ActionEvent event) {
      }

      protected void onSeriesAForm_SarSetButtonAction(Component c, ActionEvent event) {
      }

      protected void onAngelSeedRoundForm_AsrNameTextFieldAction(Component c, ActionEvent event) {
      }

      protected void onAngelSeedRoundForm_AsrYearTextFieldAction(Component c, ActionEvent event) {
      }

      protected void onAngelSeedRoundForm_AsrRaiseTextFieldAction(Component c, ActionEvent event) {
      }

      protected void onAngelSeedRoundForm_AsrPercentageTextFieldAction(Component c, ActionEvent event) {
      }

      protected void onAngelSeedRoundForm_AsrValuationTextFieldAction(Component c, ActionEvent event) {
      }

      protected void onAngelSeedRoundForm_AsrPrefTextFieldAction(Component c, ActionEvent event) {
      }

      protected void onAngelSeedRoundForm_AsrDividendTextFieldAction(Component c, ActionEvent event) {
      }

      protected void onAngelSeedRoundForm_AsrSetButtonAction(Component c, ActionEvent event) {
      }

      protected void onMain_FoundersButtonAction(Component c, ActionEvent event) {
      }

      protected void onMain_FriendsFamily1ButtonAction(Component c, ActionEvent event) {
      }

      protected void onMain_FriendsFamily2ButtonAction(Component c, ActionEvent event) {
      }

      protected void onMain_AngelSeedButtonAction(Component c, ActionEvent event) {
      }

      protected void onMain_PreSeriesAButtonAction(Component c, ActionEvent event) {
      }

      protected void onMain_SeriesAButtonAction(Component c, ActionEvent event) {
      }

      protected void onMain_CapTableFoundersButtonAction(Component c, ActionEvent event) {
      }

      protected void onMain_CapTableFriendFamilyButtonAction(Component c, ActionEvent event) {
      }

      protected void onMain_CapTableAngelSeedButtonAction(Component c, ActionEvent event) {
      }

      protected void onMain_CapTableSeriesAButtonAction(Component c, ActionEvent event) {
      }

      protected void onMain_BuyoutTextFieldAction(Component c, ActionEvent event) {
      }

      protected void onMain_ExitYearTextFieldAction(Component c, ActionEvent event) {
      }

      protected void onMain_ViewWaterfallButtonAction(Component c, ActionEvent event) {
      }

      protected void onMain_AboutTextAreaAction(Component c, ActionEvent event) {
      }

      protected void onMain_CompanyNameTextFieldAction(Component c, ActionEvent event) {
      }

      protected void onMain_YearFoundedTextFieldAction(Component c, ActionEvent event) {
      }

}
