| **Failure Observed** | **Exposing Test** | **Fault At Cause** | **How Diagnosed** | **Correction** |
| -------------------- | ----------------- | ------------------ | ----------------- | -------------- |
| IndexOutOfBoundsException thrown during initialization of VendingMachine objects. | setUp() method. | for loop initializing itemArray[] checks for "i <= NUM_SLOTS" instead of "i < NUM_SLOTS". | Compiler gave constant indexOOB errors for "index 4", during initialization, leading me to check the VendingMachine constructor and see the fault. | "i <= NUM_SLOTS" replaced with "i < NUM_SLOTS"
|
|
|