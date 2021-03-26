package com.binance.api.examples;

import com.binance.api.client.BinanceApiAsyncRestClient;
import com.binance.api.client.BinanceApiClientFactory;
import com.binance.api.client.domain.market.*;

import java.util.List;

/**
 * Examples on how to get market data information such as the latest price of a symbol, etc., in an async way.
 */
public class MarketDataEndpointsExampleAsync {

  public static void main(String[] args) {
    BinanceApiClientFactory factory = BinanceApiClientFactory.newInstance();
    BinanceApiAsyncRestClient client = factory.newAsyncRestClient();

    // Getting latest price of a symbol (async)
    client.get24HrPriceStatistics("NEOETH", (TickerStatistics response) -> {
      System.out.println(response);
    });

    // Getting all latest prices (async)
    client.getAllPrices((List<TickerPrice> response) -> {
      System.out.println(response);
    });

    // Getting agg trades (async)
    client.getAggTrades("NEOETH", (List<AggTrade> response) -> System.out.println(response));

    // Weekly candlestick bars for a symbol
    client.getCandlestickBars("NEOETH", CandlestickInterval.WEEKLY,
        (List<Candlestick> response) -> System.out.println(response));

  }
}
