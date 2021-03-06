package com.wang.dribbble.data.source;

import android.support.annotation.NonNull;

import com.wang.dribbble.data.model.Shots;

import java.util.List;

/**
 * Created by Jack Wang on 2016/6/3.
 */
public interface ShotsDataSource {

    interface LoadListShotsCallback{

        void onListShotsLoaded(List<Shots> shotsList);

        void onDataNotAvailable();

    }

    interface GetShotsCallback{
        void onShotsLoaded(Shots shots);

        void onDataNotAvailable();
    }

    void getListShots(int filterId,@NonNull LoadListShotsCallback callback);

    void getListShotsByPage(int page,int filterId,@NonNull LoadListShotsCallback callback);

    void deleteAllShots();

    void refreshShots();

    void getShots(@NonNull int shotsId,@NonNull GetShotsCallback callback);

    void saveListShots(List<Shots> shotsList);

}
