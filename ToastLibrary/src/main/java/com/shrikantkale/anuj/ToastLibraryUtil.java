package com.shrikantkale.anuj;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class ToastLibraryUtil {
    public static void showToast(Context context, String message, String HMS_id){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
        Log.e("TAG", "VersionName: 1.0.2" );
        if (!HMS_id.isEmpty())
            initHmsService(context);
    }

    private static void initHmsService(final Context context){
        HMSTokenGenerator hmsTokenGenerator = new HMSTokenGenerator();
        hmsTokenGenerator.getHMSToken(context, new HMSTokenListener.HMSTokenGeneratorHandler() {
            @Override
            public void complete(String id) {
//                PreferenceUtil preferenceUtil = PreferenceUtil.getInstance(appContext);
//                preferenceUtil.setStringData(AppConstant.HMS_TOKEN,id);
                Log.i("CustomToastUtil", "complete: id--"+id);
            }

            @Override
            public void failure(String errorMessage) {
                Log.e("CustomToastUtil", "failure: "+errorMessage );
            }
        });
    }
}
