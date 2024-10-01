package com.example.thermalprinter.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.content.res.ResourcesCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.multidex.MultiDex;
import androidx.multidex.MultiDexApplication;

import com.example.thermalprinter.R;
import com.example.thermalprinter.utils.BaseEnum;
import com.example.thermalprinter.utils.SessionManager;
import com.rt.printerlibrary.printer.RTPrinter;

//Extend Application class with MultiDexApplication for multidex support
public class IHApplication /*extends MultiDexApplication implements DefaultLifecycleObserver */{
    private static final String TAG = IHApplication.class.getSimpleName();
    private static Context mContext;
    private static String androidId;
    private Activity currentActivity;
    SessionManager sessionManager;
    public static Context getAppContext() {
        return mContext;
    }
    public static String getAndroidId() {
        return androidId;
    }
    private static IHApplication sIHApplication;

    public static IHApplication getInstance() {
        return new IHApplication();
    }


    @BaseEnum.CmdType
    private static int currentCmdType = BaseEnum.CMD_PIN;
    private static RTPrinter rtPrinter;

   /* @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
*/
   /* @Override
    public void onCreate() {
        super.onCreate();
        sIHApplication = this;
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
        mContext = getApplicationContext();
        sessionManager = new SessionManager(this);
    }
*/
    public Activity getCurrentActivity() {
        return currentActivity;
    }


  /*  @Override
    public void onTerminate() {
        super.onTerminate();
    }*/


    @BaseEnum.CmdType
    public int getCurrentCmdType() {
        return currentCmdType;
    }

    public void setCurrentCmdType(@BaseEnum.CmdType int currentCmdType) {
        this.currentCmdType = currentCmdType;
    }

    public RTPrinter getRtPrinter() {
        return rtPrinter;
    }

    public void setRtPrinter(RTPrinter rtPrinter) {
        this.rtPrinter = rtPrinter;
    }

    /**
     * for setting the Alert Dialog Custom Font.
     *
     * @param context
     * @param builderDialog
     */
    public static void setAlertDialogCustomTheme(Context context, Dialog builderDialog) {
        // Getting the view elements
        TextView textView = (TextView) builderDialog.getWindow().findViewById(android.R.id.message);
        TextView alertTitle = (TextView) builderDialog.getWindow().findViewById(androidx.appcompat.R.id.alertTitle);
        Button button1 = (Button) builderDialog.getWindow().findViewById(android.R.id.button1);
        Button button2 = (Button) builderDialog.getWindow().findViewById(android.R.id.button2);
        textView.setTypeface(ResourcesCompat.getFont(context, R.font.lato_regular));
        alertTitle.setTypeface(ResourcesCompat.getFont(context, R.font.lato_bold));
        button1.setTypeface(ResourcesCompat.getFont(context, R.font.lato_bold));
        button2.setTypeface(ResourcesCompat.getFont(context, R.font.lato_bold));
    }
}
