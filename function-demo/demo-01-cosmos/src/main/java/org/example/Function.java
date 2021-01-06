package org.example;

import com.microsoft.azure.functions.annotation.*;
import com.microsoft.azure.functions.*;

/**
 * Azure Functions with Cosmos DB trigger.
 */
public class Function {
    /**
     * This function will be invoked when there are inserts or updates in the specified database and collection.
     */
    @FunctionName("Function")
    public void run(
        @CosmosDBTrigger(
            name = "items",
            databaseName = "<databaseName>",
            collectionName = "<collectionName>",
            leaseCollectionName="<leaseCollectionName>",
            connectionStringSetting = "<connection_string_setting>",
            createLeaseCollectionIfNotExists = true
        )
        Object[] items,
        final ExecutionContext context
    ) {
        context.getLogger().info("Java Cosmos DB trigger function executed.");
        context.getLogger().info("Documents count: " + items.length);
    }
}
