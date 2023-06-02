package com.luck.picture.lib.interfaces;

import android.content.Intent;

import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.Fragment;

import com.luck.picture.lib.config.CustomIntentKey;
import com.luck.picture.lib.entity.LocalMedia;

/*********************************************************************
 * Created by shenglei on 2023/6/1.
 *********************************************************************/
public interface OnVideoEditInterceptListener {
    /**
     * Custom video edit engine
     * <p>
     * Users can implement this interface, and then access their own video edit framework to plug
     * the video edit path into the {@link LocalMedia} object;
     *
     * @param fragment
     * @param currentLocalMedia current edit LocalMedia
     * @param launcher
     */
    void onStartMediaEdit(Fragment fragment, LocalMedia currentLocalMedia, ActivityResultLauncher<Intent> launcher);
}
