package com.dumma.flowback.database;

import android.database.Observable;

import com.dumma.flowback.models.FlowbackDataItem;
import com.dumma.flowback.models.TimeBlock;

import java.util.List;

import javax.inject.Inject;

/**
 * Created by sregmi on 6/29/17.
 */

public class DatabaseResourceManager implements DatabaseResource {

    @Inject
    DatabaseHelper mDatabaseHelper;

    public DatabaseResourceManager() {}

    @Override
    public Observable<List<FlowbackDataItem>> getData(TimeBlock time) {
        return null;
    }
}
