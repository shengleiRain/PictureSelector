package com.luck.picture.lib.engine;

import android.content.Context;
import android.net.Uri;

import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.interfaces.OnKeyValueResultCallbackListener;

import java.util.ArrayList;

/*********************************************************************
 * Created by shenglei on 2023/6/1.
 *********************************************************************/
public interface VideoCompressEngine {
    /**
     * Custom video compression engine
     * <p>
     * Users can implement this interface, and then access their own compression framework to plug
     * the compressed path into the {@link LocalMedia} object;
     * </p>
     *
     * @param context
     * @param source
     */
    void onStartCompress(Context context, ArrayList<Uri> source, OnKeyValueResultCallbackListener call);
}
