package com.dumma.flowback.database;

import android.database.Observable;

import com.dumma.flowback.models.FlowbackDataItem;
import com.dumma.flowback.models.TimeBlock;

import java.util.List;

/**
 * Created by sregmi on 6/29/17.
 */

public interface DatabaseResource {

    Observable<List<FlowbackDataItem>> getData(TimeBlock time);
}
