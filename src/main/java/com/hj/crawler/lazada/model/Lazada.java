package com.hj.crawler.lazada.model;

import lombok.Data;

import java.util.List;

@Data
public class Lazada {

    private String itemId;
    private String originUrl;
    private String title;
    private List<String> galleryList;
    private List<Sku> skuList;
    private long price;
    private String seller;
    private List<String> productHighlightList;
    private List<String> detailTextList;
    private List<String> detailImageList;
    private List<String> detailContentList;
    private List<String> detailContentImageList;
}
