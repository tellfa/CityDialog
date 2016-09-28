package in.nouri.citydialog;


import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Mohammad on 19/07/2016.
 */
public class allDialog {

    private static Dialog dialog_1B, dialog_Progress, dialog_2B;

    ///// Dialog with one button
    public static void onCreate_Dialog_1B(Context context, String title, String description,
                                          String buttonTitle, final DialogCallBack callBack) {//onCreate and control CallBack
        try {
            dialog_1B = new Dialog(context);
            dialog_1B.requestWindowFeature(Window.FEATURE_NO_TITLE);
            dialog_1B.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            dialog_1B.setContentView(R.layout.dialog_1b);
            dialog_1B.setCancelable(true);

            TextView dialog_1B_title = (TextView) dialog_1B.findViewById(R.id.dialog_1b_title);
            TextView dialog_1B_description = (TextView) dialog_1B.findViewById(R.id.dialog_1b_description);
            TextView dialog_1B_acceptText = (TextView) dialog_1B.findViewById(R.id.dialog_1b_acceptText);
            ImageView dialog_1B_dismiss = (ImageView) dialog_1B.findViewById(R.id.dialog_1b_cancelButton);
            RelativeLayout dialog_1b_accept = (RelativeLayout) dialog_1B.findViewById(R.id.dialog_1b_acceptLayout);

            dialog_1B_title.setText(title);
            dialog_1B_description.setText(description);
            dialog_1B_acceptText.setText(buttonTitle);
            dialog_1b_accept.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    callBack.positiveButton();
                }
            });
            dialog_1B_dismiss.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog_1B.dismiss();
                }
            });

            dialog_1B.show();

        } catch (Exception e) {

        }
    }

    public static void dismiss_Dialog_1B() {//Dismiss dialog
        try {
            if (dialog_1B != null) {
                if (dialog_1B.isShowing()) {
                    dialog_1B.dismiss();
                }
            }
        } catch (Exception e) {

        }
    }

    ///// Dialog with two button
    public static void onCreate_Dialog_2B(Context context, String title, String description,
                                          String pButtonTitle, String nButtonTitle, final DialogCallBack callBack) {//onCreate and control CallBack
        try {
            dialog_2B = new Dialog(context);
            dialog_2B.requestWindowFeature(Window.FEATURE_NO_TITLE);
            dialog_2B.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            dialog_1B.setContentView(R.layout.dialog_2b);
            dialog_2B.setCancelable(true);

            TextView dialog_2B_title = (TextView) dialog_2B.findViewById(R.id.dialog_1b_title);
            TextView dialog_2B_description = (TextView) dialog_2B.findViewById(R.id.dialog_2b_description);
            TextView dialog_2B_acceptText = (TextView) dialog_2B.findViewById(R.id.dialog_2b_acceptText);
            TextView dialog_2B_cancelText = (TextView) dialog_2B.findViewById(R.id.dialog_2b_cancelText);
            ImageView dialog_2B_dismiss = (ImageView) dialog_2B.findViewById(R.id.dialog_2b_cancelButton);
            RelativeLayout dialog_2b_accept = (RelativeLayout) dialog_2B.findViewById(R.id.dialog_2b_acceptLayout);
            RelativeLayout dialog_2b_cancel = (RelativeLayout) dialog_2B.findViewById(R.id.dialog_2b_cancelLayout);

            dialog_2B_title.setText(title);
            dialog_2B_description.setText(description);
            dialog_2B_acceptText.setText(pButtonTitle);
            dialog_2b_accept.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    callBack.positiveButton();
                }
            });
            dialog_2B_dismiss.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog_2B.dismiss();
                }
            });
            dialog_2B_cancelText.setText(nButtonTitle);
            dialog_2b_cancel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    callBack.negativeButton();
                }
            });

            dialog_2B.show();

        } catch (Exception e) {

        }
    }

    public static void dismiss_Dialog_2B() {//Dismiss dialog
        try {
            if (dialog_2B != null) {
                if (dialog_2B.isShowing()) {
                    dialog_2B.dismiss();
                }
            }
        } catch (Exception e) {

        }
    }

    ///// Dialog with ProgressBar
    public static void onCreate_Dialog_progress(Context context, String title, String description) {//onCreate and control CallBack
        try {
            dialog_Progress = new Dialog(context);
            dialog_Progress.requestWindowFeature(Window.FEATURE_NO_TITLE);
            dialog_Progress.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            dialog_Progress.setContentView(R.layout.dialog_progress);
            dialog_Progress.setCancelable(true);

            TextView dialog_progress_title = (TextView) dialog_Progress.findViewById(R.id.dialog_progress_title);
            TextView dialog_progress_description = (TextView) dialog_Progress.findViewById(R.id.dialog_progress_description);
            //ImageView dialog_progress_dismiss = (ImageView) dialog_Progress.findViewById(R.id.dialog_progress_cancelButton);

            dialog_progress_title.setText(title);
            dialog_progress_description.setText(description);

/*            dialog_progress_dismiss.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog_Progress.dismiss();
                }
            });*/

            dialog_Progress.show();

        } catch (Exception e) {

        }
    }

    public static void dismiss_Dialog_progress() {//Dismiss dialog
        try {
            if (dialog_Progress != null) {
                if (dialog_Progress.isShowing()) {
                    dialog_Progress.dismiss();
                }
            }
        } catch (Exception e) {

        }
    }

}