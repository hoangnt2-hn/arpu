/*
 * Copyright (C) 2020 Viettel Digital Services. All rights reserved.
 * VIETTEL PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.viettel.arpu.model.request.mb;

import com.viettel.arpu.validator.Phone;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * @Author VuHQ
 * @Since 6/2/2020
 */
@Getter
@Setter
@ToString
public class MbPayLoanForm extends MbRequestIdForm {
    @NotNull
    private Long id = null;
    @NotNull
    private BigDecimal amount = null;
    @NotBlank
    @Phone
    private String sourceMobile = "";
    @NotBlank
    private String sourceNumber = "";
    @NotBlank
    private String loanAccount = "";
}
