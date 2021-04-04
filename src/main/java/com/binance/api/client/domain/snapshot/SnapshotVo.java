package com.binance.api.client.domain.snapshot;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * A deposit that was done to a Binance account.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SnapshotVo {

  /**
   * Amount deposited.
   */
  @JsonProperty("data")
  private SnapshotData snapshotData;

  /**
   * Symbol.
   */
  private String type;

  /**
   * Deposit time.
   */
  private String updateTime;

    public SnapshotData getSnapshotData() {
        return snapshotData;
    }

    public void setSnapshotData(SnapshotData snapshotData) {
        this.snapshotData = snapshotData;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
                .append("snapshotData", snapshotData)
                .append("type", type)
                .append("updateTime", updateTime)
                .toString();
    }
}
