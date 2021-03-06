package com.gantch.nbiotmanagement.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author lcw332
 * Date 2019-12-20-9:50
 * Description:  nbiot-devies-management , com.gantch.nbiotdevicesmanagement.model
 * 前台用户model user_member
 **/
@Data
public class UserMember {

    private Integer id;

    private String username;

    private String password;

    @ApiModelProperty(value = "租户Id")
    private Integer tenantId;

    @ApiModelProperty(value = "用户昵称")
    private String name;

    @ApiModelProperty(value = "手机号")
    private String phone;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "微信openId")
    private String openId;

    @ApiModelProperty(value = "创建时间")
    private Date crateTime;
}
