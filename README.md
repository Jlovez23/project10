## mermaid uml
```
classDiagram

class HasMenu{
    + menu() String
    + start() void
}

class CheckingAccount{
    - balance : double
    + CheckingAccount()
    + CheckingAccount(balance)
    + main() : void
    + start() : string
    + getBalance() : double
    + getBalanceString() : string
    + setBalance(balance) : void
    + checkBalance() : double
    - getDouble() : double
    + makeDeposit() : void
    + makeWithdrawal() : void
}

class SavingsAccount{
    - interestRate: double
    + main(*)
    + calcinterest() : void
    + setinterestRate() : void
    + getinterestRate() : void
}

class Customer{
    - checking : CheckingAccount
    - savings : SavingsAccount 
    + main() : void
    + Customer()
    + start() void
    + menu() : String
    + changePIN() : void
    + getReport() : String
}

class User Abstract{
    - userName : String
    - PIN : String
    + login : boolean
    + login(userName, PIN) : boolean
    + setUserName(userName) : void
    + getUserName() : String
    + setPIN(PIN) : void
    + getPIN() : String
    + getReport() : (abstract) String
}

CheckingAccount --> HasMenu
User Abstract --> HasMenu
SavingsAccount --|> CheckingAccount
Customer --|> User Abstract
```


