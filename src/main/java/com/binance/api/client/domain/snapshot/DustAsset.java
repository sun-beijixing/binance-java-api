package com.binance.api.client.domain.snapshot;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

/**
 * @ClassName DustAsset
 * @Description TODO
 * @Author wangwei.0822@163.com
 * @Data 2021/4/18 10:01
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
public class DustAsset {

    private String totalServiceCharge;
    private String totalTransfered;

    @JsonProperty("transferResultVo")
    private List<TransferResultVo> snapshotVos;

    public String getTotalServiceCharge() {
        return totalServiceCharge;
    }

    public void setTotalServiceCharge(String totalServiceCharge) {
        this.totalServiceCharge = totalServiceCharge;
    }

    public String getTotalTransfered() {
        return totalTransfered;
    }

    public void setTotalTransfered(String totalTransfered) {
        this.totalTransfered = totalTransfered;
    }

    public List<TransferResultVo> getSnapshotVos() {
        return snapshotVos;
    }

    public void setSnapshotVos(List<TransferResultVo> snapshotVos) {
        this.snapshotVos = snapshotVos;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
                .append("totalServiceCharge", totalServiceCharge)
                .append("totalTransfered", totalTransfered)
                .append("snapshotVos", snapshotVos)
                .toString();
    }
}
