package in.vedang.NumConvert;

import android.content.Context;
import android.util.Log;
import com.google.appinventor.components.annotations.*;
import com.google.appinventor.components.runtime.*;
import com.google.appinventor.components.common.ComponentCategory;


@DesignerComponent(version = 1,  description = "Made By Techno Vedang AKA developer vedang",
        category = ComponentCategory.EXTENSION,
        nonVisible = true,   iconName = "")
@SimpleObject(external = true)
public class NumConvert extends AndroidNonvisibleComponent {
    private ComponentContainer container;
    private String result;
    private char aa;
    private char bb;
    private char cc;
    /**
     * @param container container, component will be placed in
     */
    public NumConvert(ComponentContainer container) {
        super(container.$form());
        this.container = container;
    }

    @SimpleFunction(description = "Method for Convert Number")
    public String Convert(int value){
        try {
            String a = Integer.toString(value);
            if (a.length() == 4){
                aa = a.charAt(0);
                bb = a.charAt(1);
                result = Character.toString(aa) + "." + Character.toString(bb) + "k";
                return result;
            }else if (a.length() == 5){
                aa = a.charAt(0);
                bb = a.charAt(1);
                cc = a.charAt(2);
                result = Character.toString(aa) + Character.toString(bb)+ "." + Character.toString(cc) + "k";
                return result;
            }else if (a.length() == 6){
                aa = a.charAt(0);
                bb = a.charAt(1);
                cc = a.charAt(2);
                result = Character.toString(aa) + Character.toString(bb) + Character.toString(cc)+ "k";
                return result;
            }else if (a.length() == 7){
                aa = a.charAt(0);
                bb = a.charAt(1);
                result = Character.toString(aa) + "." + Character.toString(bb) + "m";
            }else if(a.length() == 8){
                aa = a.charAt(0);
                bb = a.charAt(1);
                cc = a.charAt(2);
                result = Character.toString(aa) + Character.toString(bb) + "m";
                return result;
            }else if (a.length() == 9){
                aa = a.charAt(0);
                bb = a.charAt(1);
                cc = a.charAt(2);
                result = Character.toString(aa) + Character.toString(bb) + Character.toString(cc) + "m";
               return result;
            }else if (a.length() > 9){
                return "Given Value Is Too Big To Convert";
            }else {
                return String.valueOf(value);
            }
        }catch (Exception e){
            OnError(e.getMessage());
            return "0";
        }
return result;
    }

    @SimpleEvent(description = "Event For Error")
    public void OnError(String error){
        EventDispatcher.dispatchEvent(this, "OnError", error);
    }

}
