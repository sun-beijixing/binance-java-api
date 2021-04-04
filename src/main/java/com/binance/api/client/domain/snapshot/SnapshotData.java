package com.binance.api.client.domain.snapshot;

import com.binance.api.client.constant.BinanceApiConstants;
import com.binance.api.client.domain.account.AssetBalance;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

/**
 * A deposit that was done to a Binance account.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SnapshotData {

  /**
   * Amount deposited.
   */
  private List<AssetBalance> balances;

  /**
   * Symbol.
   */
  private String totalAssetOfBtc;

    public List<AssetBalance> getBalances() {
        return balances;
    }

    public void setBalances(List<AssetBalance> balances) {
        this.balances = balances;
    }

    public String getTotalAssetOfBtc() {
        return totalAssetOfBtc;
    }

    public void setTotalAssetOfBtc(String totalAssetOfBtc) {
        this.totalAssetOfBtc = totalAssetOfBtc;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
                .append("balances", balances)
                .append("totalAssetOfBtc", totalAssetOfBtc)
                .toString();
    }
}
