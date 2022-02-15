package Manager;


import Account.Account;
import Address.Address;

public class AddressManager {
    public static void addAddress(Account account, Address address)  {
        account.addAddress(address);
    }

    public static void removeAddress(Account account, Address address) {
        account.deleteAddress(address);
    }

}
