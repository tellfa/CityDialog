package in.nouri.citydialog;

import android.app.Dialog;

/**
 * Created by Mohammad on 19/07/2016.
 */
public interface DialogCallBack {

    public void positiveButton();
    public void negativeButton();
    public void neutralButton();
    public void init(Dialog dialog);
}