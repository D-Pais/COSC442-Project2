
| **Method** | **Under Valid Behaviour** | **Under Invalid Behaviour** | **Behaviour Boundaries** | **Oracle** | **Related JUnit Test(s)** |
| ---------- | ------------------------- | --------------------------- | ------------------------ | ---------- | ------------------------- |
| Vending Machine: constructor | A non-null Vending Machine object is created with 4 null item slots, 4 item codes (A, B, C, D) mapped to their proper item slots (1, 2, 3, 4), and an initial balance of 0.  No errors are thrown. | N/A | N/A | Comment at beginning of file details correct starting state of Vending Machine. | testVendingConstructor() |
| Vending Machine: addItem() | The provided Item is added to the Machine's itemArray[] at the index corresponding to Code. | If the slot is not null, a custom exception is thrown stating it is occupied at that slot. | If the machine's state has the item slot not empty, the behaviour changes from assigning the given item to the slot to throwing an exception. | Comment above method details correct pre/post conditions and exception. | testAddItem() |
| Vending Machine: getBalance() | The balance of the vending machine is returned as normal. | N/A | The method precondition expects the balance of the machine to be positive, but there is no change to behaviour if the balance is somehow negative. | Comment above method details correct pre/post conditions. | testGetBalance() |
|
| Vending Machine: insertMoney() | Increases the balance of the machine by the amount specified. | If the amount is less than zero, a custom exception is thrown stating the amount inserted can't be negative. | If the double passed for amount is negative, the behaviour changes from setting balance = (balance + amount) to throwing an exception.  Also assumes machine balance to be positive, but with no change to behaviour if somehow negative. | Comment above method details correct pre/post conditions and exception. | testInsertMoney() |
|
|
|
| Vending Machine Item: constructor | A Vending Machine Item object is created with the provided Name and Price. | If price is less than zero, a custom exception is thrown stating the price can't be negative. | If the double passed for price is negative, the behaviour changes from creating the item to throwing an exception. | Comment above method details correct constructor pre/post conditions and exception. | testItemConstructor(), testItemConstructorNegative(), testItemConstructorZero() |
| Vending Machine Item: getName() | The name of the item is returned as normal. | N/A | N/A | Comment above method details proper output. | testGetName() |
| Vending Machine Item: getPrice()  | The price of the item is returned as normal. | N/A | N/A | Comment above method details proper output. | testGetPrice() |
