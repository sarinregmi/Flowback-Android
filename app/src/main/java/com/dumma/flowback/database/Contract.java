package com.dumma.flowback.database;

import android.provider.BaseColumns;

/**
 * Created by sregmi on 6/27/17.
 */

final class Contract {

        private Contract() {}

        public static final String TABLE_NAME = "FlowbackData";

        static class Columns implements BaseColumns {
            public static final String _ID= "id";
            public static final String PRESSURE = "pressure";
            public static final String OIL = "oil";
            public static final String GAS = "gas";
            public static final String WATER_RATE = "water_rate";
            public static final String OIL_RATE = "oil_rate";
            public static final String GAS_RATE = "gas_rate";
            public static final String CHOKE = "choke";
            public static final String TIMESTAMP = "timestamp"; /** Db: TEXT,    Java: Date       */
        }
}
