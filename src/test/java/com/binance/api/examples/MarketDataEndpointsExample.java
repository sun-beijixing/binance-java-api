package com.binance.api.examples;

import com.binance.api.client.BinanceApiClientFactory;
import com.binance.api.client.BinanceApiRestClient;
import com.binance.api.client.domain.market.*;

import java.util.List;

/**
 * Examples on how to get market data information such as the latest price of a symbol, etc.
 */
public class MarketDataEndpointsExample {

  public static void main(String[] args) {
    BinanceApiClientFactory factory = BinanceApiClientFactory.newInstance();
    BinanceApiRestClient client = factory.newRestClient();

    // Getting latest price of a symbol
    TickerStatistics tickerStatistics = client.get24HrPriceStatistics("NEOETH");
    System.out.println(tickerStatistics);

    // Getting all latest prices
    List<TickerPrice> allPrices = client.getAllPrices();
    System.out.println(allPrices);

    // Getting agg trades
    List<AggTrade> aggTrades = client.getAggTrades("NEOETH");
    System.out.println(aggTrades);

    // Weekly candlestick bars for a symbol
    List<Candlestick> candlesticks = client.getCandlestickBars("NEOETH", CandlestickInterval.WEEKLY);
    System.out.println(candlesticks);

  }
}
