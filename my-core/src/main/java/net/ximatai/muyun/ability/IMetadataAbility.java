package net.ximatai.muyun.ability;

import net.ximatai.muyun.database.metadata.DBTable;

public interface IMetadataAbility extends IDatabaseAbility {

    String getSchemaName();

    String getMainTable();

    default String getPK() {
        return "id";
    }

    default DBTable getDBTable() {
        return getDatabaseOperations().getDBInfo().getSchema(getSchemaName()).getTable(getMainTable());
    }

}
