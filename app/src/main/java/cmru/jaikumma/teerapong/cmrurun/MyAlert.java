package cmru.jaikumma.teerapong.cmrurun;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.preference.DialogPreference;

/**
 * Created by User on 27/6/2559.
 */
public class MyAlert {

    public void myDialog(Context context, String strTitle, String strMessage) {
        AlertDialog.Builder builder= new AlertDialog.Builder(context);
        builder.setCancelable(false);
        builder.setIcon(R.drawable.danger);
        builder.setTitle(strTitle);
        builder.setMessage(strMessage);
       builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
           @Override
           public void onClick(DialogInterface dialog, int which) {
                          }
       });
           }


} //Main Class
