package in.nouri.citydialog;

import android.app.Dialog;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Context context;
    private AppCompatButton btn_1dialog, btn_2dialog, btn_progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Initialize views*/
        context = this;
        btn_1dialog = (AppCompatButton) findViewById(R.id.dialog_1Button);
        btn_1dialog.setOnClickListener(this);
        btn_2dialog = (AppCompatButton) findViewById(R.id.dialog_2Button);
        btn_2dialog.setOnClickListener(this);
        btn_progress = (AppCompatButton) findViewById(R.id.dialog_progressBar);
        btn_progress.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.dialog_1Button:

                allDialog.onCreate_Dialog_1B(context, "Dialog Title", "This description has 1Button Dialog",
                        "OK", new DialogCallBack() {
                            @Override
                            public void positiveButton() {
                                Toast.makeText(context, "You press OK Button", Toast.LENGTH_SHORT).show();

                                allDialog.dismiss_Dialog_1B();
                            }

                            @Override
                            public void negativeButton() {
                            }

                            @Override
                            public void neutralButton() {
                            }

                            @Override
                            public void init(Dialog dialog) {
                            }
                        });

                break;

            case R.id.dialog_2Button:

                allDialog.onCreate_Dialog_2B(context, "Dialog Title", "This description has 2Button Dialog",
                        "OK", "Cancel", new DialogCallBack() {
                            @Override
                            public void positiveButton() {
                                Toast.makeText(context, "You press OK Button", Toast.LENGTH_SHORT).show();

                                allDialog.dismiss_Dialog_2B();
                            }

                            @Override
                            public void negativeButton() {
                                Toast.makeText(context, "You press Cancel Button", Toast.LENGTH_SHORT).show();

                                allDialog.dismiss_Dialog_2B();
                            }

                            @Override
                            public void neutralButton() {

                            }

                            @Override
                            public void init(Dialog dialog) {

                            }
                        });

                break;
            case R.id.dialog_progressBar:

                allDialog.onCreate_Dialog_progress(context, "Dialog Title", "This description has Progress Dialog");

                break;
        }

    }
}
