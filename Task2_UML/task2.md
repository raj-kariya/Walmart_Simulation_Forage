Here are the requirements for your design:

1. The processor must implement a `configure` method that accepts a `ModeIdentifier` and a `DatabaseIdentifier` as parameters.
   - This method is called to change the operating mode of the processor, and/or select the current database.
   - The processor must be able to change between the following modes:
     - **Dump mode**: simply drops the data.
     - **Passthrough mode**: inserts the data into the currently configured database.
     - **Validate mode**: validates the data, then inserts it (both operations are carried out on the currently configured database).

2. The processor must be able to swap between the following databases. Each database will require a different implementation to insert and validate data:
   - **Postgres**
   - **Redis**
   - **Elastic**

3. The processor must implement a `process` method that accepts a `DataPoint` as a parameter.
   - This method will have different behavior depending on the currently configured mode and database.