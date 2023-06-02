package com.luck.picture.lib.engine;

import android.net.Uri;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

/*********************************************************************
 * Created by shenglei on 2023/6/1.
 *********************************************************************/
public interface VideoEditorEngine {
    void onVideoEdit(Fragment fragment, Uri srcUri, Uri destinationUri, ArrayList<String> dataSource, int requestCode);
}
