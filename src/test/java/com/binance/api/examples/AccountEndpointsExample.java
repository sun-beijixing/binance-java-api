package com.binance.api.examples;

import com.binance.api.client.BinanceApiClientFactory;
import com.binance.api.client.BinanceApiRestClient;
import com.binance.api.client.domain.account.Account;
import com.binance.api.client.domain.account.Trade;
import com.binance.api.client.domain.snapshot.AccountSnapshot;

import java.util.List;

/**
 * Examples on how to get account information.
 */
public class AccountEndpointsExample {

  public static void main(String[] args) {
    BinanceApiClientFactory factory = BinanceApiClientFactory.newInstance("YOUR_API_KEY", "YOUR_SECRET");
    BinanceApiRestClient client = factory.newRestClient();

    // Get account balances
    Account account = client.getAccount(60_000L, System.currentTimeMillis());
    System.out.println(account.getBalances());
    System.out.println(account.getAssetBalance("ETH"));

    // Get list of trades
    List<Trade> myTrades = client.getMyTrades("NEOETH");
    System.out.println(myTrades);

    // Get account snapshots（"SPOT", "MARGIN", "FUTURES"）
    AccountSnapshot myAccountSnapshot = client.getAccountSnapshot("SPOT");
    System.out.println(myAccountSnapshot);

  }
}
