package cn.iocoder.mall.productservice.rpc.attr.dto;

import cn.iocoder.common.framework.enums.CommonStatusEnum;
import cn.iocoder.common.framework.validator.InEnum;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 商品规格值创建 Request DTO
 */
@Data
@Accessors(chain = true)
public class ProductAttrValueCreateReqDTO implements Serializable {

    /**
     * 规格键编号
     */
    @NotNull(message = "规格键编号不能为空")
    private Integer attrKeyId;
    /**
     * 规格值名字
     */
    @NotEmpty(message = "规格值名字不能为空")
    private String name;
    /**
     * 状态
     */
    @NotNull(message = "状态不能为空")
    @InEnum(value = CommonStatusEnum.class, message = "修改状态必须是 {value}")
    private Integer status;

}
