package com.binance.api.client.domain.snapshot;

import com.binance.api.client.constant.BinanceApiConstants;
import com.binance.api.client.domain.account.AssetBalance;
import com.binance.api.client.domain.account.Deposit;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

/**
 * Account information.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountSnapshot {

    private Integer code;

    private String msg;

    @JsonProperty("snapshotVos")
    private List<SnapshotVo> snapshotVos;


    public List<SnapshotVo> getSnapshotVos() {
        return snapshotVos;
    }

    public void setSnapshotVos(List<SnapshotVo> snapshotVos) {
        this.snapshotVos = snapshotVos;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
                .append("snapshotVos", snapshotVos)
                .append("code", code)
                .append("msg", msg)
                .toString();
    }
}
