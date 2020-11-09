package com.zr.dao.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

@ApiModel
public class BaseCard {
    @ApiModelProperty(value="idid")
    @JsonProperty("id")
    private Long id;

    @ApiModelProperty(value="templeteId模版id")
    @JsonProperty("templete_id")
    private Long templeteId;

    @ApiModelProperty(value="cardCode卡片编码")
    @JsonProperty("card_code")
    private String cardCode;

    @ApiModelProperty(value="title名称")
    @JsonProperty("title")
    private String title;

    @ApiModelProperty(value="iconUrl图标地址")
    @JsonProperty("icon_url")
    private String iconUrl;

    @ApiModelProperty(value="dataUrl数据获取地址")
    @JsonProperty("data_url")
    private String dataUrl;

    @ApiModelProperty(value="component前端js地址")
    @JsonProperty("component")
    private String component;

    @ApiModelProperty(value="cardDesc卡片描述")
    @JsonProperty("card_desc")
    private String cardDesc;

    @ApiModelProperty(value="layoutInfo卡片内部布局信息")
    @JsonProperty("layout_info")
    private String layoutInfo;

    @ApiModelProperty(value="type类型")
    @JsonProperty("type")
    private Byte type;

    @ApiModelProperty(value="isDel0 未删 1 删除")
    @JsonProperty("is_del")
    private Boolean isDel;

    @ApiModelProperty(value="creator创建人")
    @JsonProperty("creator")
    private String creator;

    @ApiModelProperty(value="createTime创建时间")
    @JsonProperty("create_time")
    private Date createTime;

    @ApiModelProperty(value="updator更新人")
    @JsonProperty("updator")
    private String updator;

    @ApiModelProperty(value="updateTime更新时间")
    @JsonProperty("update_time")
    private Date updateTime;

    @ApiModelProperty(value="cardData数据")
    @JsonProperty("card_data")
    private String cardData;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTempleteId() {
        return templeteId;
    }

    public void setTempleteId(Long templeteId) {
        this.templeteId = templeteId;
    }

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode == null ? null : cardCode.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl == null ? null : iconUrl.trim();
    }

    public String getDataUrl() {
        return dataUrl;
    }

    public void setDataUrl(String dataUrl) {
        this.dataUrl = dataUrl == null ? null : dataUrl.trim();
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component == null ? null : component.trim();
    }

    public String getCardDesc() {
        return cardDesc;
    }

    public void setCardDesc(String cardDesc) {
        this.cardDesc = cardDesc == null ? null : cardDesc.trim();
    }

    public String getLayoutInfo() {
        return layoutInfo;
    }

    public void setLayoutInfo(String layoutInfo) {
        this.layoutInfo = layoutInfo == null ? null : layoutInfo.trim();
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Boolean getIsDel() {
        return isDel;
    }

    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdator() {
        return updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator == null ? null : updator.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCardData() {
        return cardData;
    }

    public void setCardData(String cardData) {
        this.cardData = cardData == null ? null : cardData.trim();
    }
}