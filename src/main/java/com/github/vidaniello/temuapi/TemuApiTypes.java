package com.github.vidaniello.temuapi;

/**
 * Elenco completo dei 'type' delle API TEMU disponibili nella guida
 * all'indirizzo https://partner-eu.temu.com/documentation
 * (generato dall'elenco pagine di riferimento API, doc_type=2, 149 API univoche).
 *
 * <p>Ogni costante e' il valore da passare al parametro 'type' della richiesta
 * oppure al metodo generico
 * {@link TemuClient#doPOSTByType(String, com.google.gson.JsonObject, Class)} /
 * {@link TemuClient#doPOSTEnvelopeByType(String, com.google.gson.JsonObject)}.
 * Il link della documentazione di ciascuna API e' riportato nel commento.</p>
 *
 * @author Vincenzo D'Aniello (vidaniello@gmail.com) github.com/vidaniello
 */
public final class TemuApiTypes {

	private TemuApiTypes() {
	}

	// === AFTERSALES ===
	public static final String BG_AFTERSALES_AFTERSALES_LIST_GET = "bg.aftersales.aftersales.list.get"; // 6072f78f929246edbf13a26e545ac943
	public static final String BG_AFTERSALES_CANCEL_AGREE = "bg.aftersales.cancel.agree"; // 4e24e9312bf14824b40a4f12089829cc
	public static final String BG_AFTERSALES_CANCEL_LIST_GET = "bg.aftersales.cancel.list.get"; // 655f2f3391424ab68f2efad167b437b0
	public static final String BG_AFTERSALES_PARENTAFTERSALES_LIST_GET = "bg.aftersales.parentaftersales.list.get"; // 235c5b223da342a0b81e8758c9214693
	public static final String BG_AFTERSALES_PARENTRETURNORDER_GET = "bg.aftersales.parentreturnorder.get"; // 5afe9069bbd047b7b793750e63b63f21
	public static final String TEMU_AFTERSALES_CARRIER_GET = "temu.aftersales.carrier.get"; // a978dbb8bdae4f7d8f3853b71b2088ed
	public static final String TEMU_AFTERSALES_PARENTAFTERSALES_DETAIL_GET = "temu.aftersales.parentaftersales.detail.get"; // 5b231fc61d0b491485f7919288f334f7
	public static final String TEMU_AFTERSALES_REFUND_ISSUE = "temu.aftersales.refund.issue"; // d79b16bceeae4e7694eae128f8f172fc
	public static final String TEMU_AFTERSALES_RETURNADDRESS_GET = "temu.aftersales.returnaddress.get"; // c51709b323fc498e828a1a0a7494278a
	public static final String TEMU_AFTERSALES_RETURNLABEL_PREPARE_GET = "temu.aftersales.returnlabel.prepare.get"; // 6fa91c79c0f64559b2df1367ac16431b
	public static final String TEMU_AFTERSALES_SIGNATURE_GET = "temu.aftersales.signature.get"; // c80ceb6f219e4b099ea991aeca741063
	public static final String TEMU_AFTERSALES_UPLOAD_RETURNLABEL = "temu.aftersales.upload.returnlabel"; // 7304ca8d46d54290b5160f1c4a6c8f3b

	// === COOPERATIVEWAREHOUSE ===
	public static final String BG_COOPERATIVEWAREHOUSE_FULFILL_CANCEL = "bg.cooperativewarehouse.fulfill.cancel"; // e52b76ba10ee4d0ba52146f0fd493e0f
	public static final String BG_COOPERATIVEWAREHOUSE_FULFILL_QUERY = "bg.cooperativewarehouse.fulfill.query"; // 93f8fa23818d434d944c063572e44a81
	public static final String BG_COOPERATIVEWAREHOUSE_FULFILL_SUBMIT = "bg.cooperativewarehouse.fulfill.submit"; // b02c0b4c93d84c36a3b7c287efdb1e4b
	public static final String BG_COOPERATIVEWAREHOUSE_PROVIDER_LIST = "bg.cooperativewarehouse.provider.list"; // 3c4c31aa11a040b082e5438be98827b1
	public static final String BG_COOPERATIVEWAREHOUSE_TOKEN_AUTHORIZATION = "bg.cooperativewarehouse.token.authorization"; // 324ff36178694a208dd54b1cab573a10

	// === FINANCE ===
	public static final String TEMU_FINANCE_MALL_BILL_TASK_CREATE = "temu.finance.mall.bill.task.create"; // ce195eab32ab4156b3f1aeea2e893eba
	public static final String TEMU_FINANCE_MALL_BILL_TASK_GET = "temu.finance.mall.bill.task.get"; // b500ff4c27ff4c95bcbcf6c1da99c58f

	// === FREIGHT ===
	public static final String BG_FREIGHT_TEMPLATE_LIST_QUERY = "bg.freight.template.list.query"; // 792633792cc3433c8e4a3807a0eb15e5

	// === LOCAL ===
	public static final String BG_LOCAL_COMPLIANCE_GOODS_LIST_QUERY = "bg.local.compliance.goods.list.query"; // cf3e1c09736d4f1f96c4b0016b2af52d
	public static final String BG_LOCAL_GOODS_ADD = "bg.local.goods.add"; // d38725b9f8f849ed8283e6a944e7957b
	public static final String BG_LOCAL_GOODS_CATEGORY_CHECK = "bg.local.goods.category.check"; // fbcf3afb3eac4f039e30982ca5641033
	public static final String BG_LOCAL_GOODS_CATEGORY_RECOMMEND = "bg.local.goods.category.recommend"; // 0af12ee234aa45afba903500be510dc7
	public static final String BG_LOCAL_GOODS_CATS_GET = "bg.local.goods.cats.get"; // bbc8a6bdfc884460844d190f1b732726
	public static final String BG_LOCAL_GOODS_COMPLIANCE_EDIT = "bg.local.goods.compliance.edit"; // 4499655e8cb044a0b8a30f9c9994f723
	public static final String BG_LOCAL_GOODS_COMPLIANCE_EXTRA_TEMPLATE_GET = "bg.local.goods.compliance.extra.template.get"; // 0e72dcd1c913474eb173d61a18e39bd3
	public static final String BG_LOCAL_GOODS_COMPLIANCE_INFO_FILL_LIST_QUERY = "bg.local.goods.compliance.info.fill.list.query"; // b0739963eb1a4dd38e83a7aebf609c48
	public static final String BG_LOCAL_GOODS_COMPLIANCE_PROPERTY_CHECK = "bg.local.goods.compliance.property.check"; // 41d43397c22549dcb87418d6675d794d
	public static final String BG_LOCAL_GOODS_COMPLIANCE_RULES_GET = "bg.local.goods.compliance.rules.get"; // bf3d5ea0276645da94a1863566962191
	public static final String BG_LOCAL_GOODS_DETAIL_QUERY = "bg.local.goods.detail.query"; // 50a6dd012fcd41149a2d8ef2cdc58b69
	public static final String BG_LOCAL_GOODS_GALLERY_SIGNATURE_GET = "bg.local.goods.gallery.signature.get"; // 1f863ec78e5c404fafa505bc2770c58a
	public static final String BG_LOCAL_GOODS_IMAGE_UPLOAD = "bg.local.goods.image.upload"; // ea20185c68f6453ea3ed3632ddd366d6
	public static final String BG_LOCAL_GOODS_LIST_QUERY = "bg.local.goods.list.query"; // 43baaa509c4b4b419853558a613715de
	public static final String BG_LOCAL_GOODS_MULTI_SITE_SUBMIT = "bg.local.goods.multi.site.submit"; // 675b3e55a7a2426b92d9694be5f99667
	public static final String BG_LOCAL_GOODS_OUT_SN_CHECK = "bg.local.goods.out.sn.check"; // 20ed2dbe4e514bc291c706b8f8424207
	public static final String BG_LOCAL_GOODS_OUT_SN_SET = "bg.local.goods.out.sn.set"; // b203fc2bdde346239dbb51da1dc2e713
	public static final String BG_LOCAL_GOODS_PARTIAL_UPDATE = "bg.local.goods.partial.update"; // f25a3d4a2a884c97ada8944250fd176e
	public static final String BG_LOCAL_GOODS_PRICEORDER_CHANGE_SKU_PRICE = "bg.local.goods.priceorder.change.sku.price"; // 8616b0a1a8114c66919739862bf46f79
	public static final String BG_LOCAL_GOODS_PRICEORDER_QUERY = "bg.local.goods.priceorder.query"; // a7b6c2797e9f49d7a48977fbba8b1e0c
	public static final String BG_LOCAL_GOODS_PROPERTY_GET = "bg.local.goods.property.get"; // 42cd0095f6964ed88a2750bf8f005809
	public static final String BG_LOCAL_GOODS_PROPERTY_RELATIONS = "bg.local.goods.property.relations"; // d93de48fc77d49d38764292d69dc5abd
	public static final String BG_LOCAL_GOODS_PROPERTY_RELATIONS_LEVEL_TEMPLATE = "bg.local.goods.property.relations.level.template"; // ef845cd5342c4dc7b0c44c2f361abfbb
	public static final String BG_LOCAL_GOODS_PROPERTY_RELATIONS_TEMPLATE = "bg.local.goods.property.relations.template"; // bfd820e01f23408689b2b532816e475d
	public static final String BG_LOCAL_GOODS_SALE_STATUS_SET = "bg.local.goods.sale.status.set"; // 40fd5e090dbb4a3790d1c2b88223ec5e
	public static final String BG_LOCAL_GOODS_SIZE_ELEMENT_GET = "bg.local.goods.size.element.get"; // 2a8eb8aa013547e692215d84ea493f64
	public static final String BG_LOCAL_GOODS_SKU_LIST_PRICE_QUERY = "bg.local.goods.sku.list.price.query"; // c0de4d3f92d94b84a5044c4a3beda9f2
	public static final String BG_LOCAL_GOODS_SKU_LIST_QUERY = "bg.local.goods.sku.list.query"; // 9844039f01204efea2c7355dfdc1eace
	public static final String BG_LOCAL_GOODS_SKU_OUT_SN_CHECK = "bg.local.goods.sku.out.sn.check"; // 395a5e48626a4581977a2f9ebb8c7302
	public static final String BG_LOCAL_GOODS_SKU_OUT_SN_SET = "bg.local.goods.sku.out.sn.set"; // e020cff4237247458fdf20fd17675c37
	public static final String BG_LOCAL_GOODS_SPEC_ID_GET = "bg.local.goods.spec.id.get"; // 605d30d83a8840a195585e2ad620bd37
	public static final String BG_LOCAL_GOODS_STOCK_EDIT = "bg.local.goods.stock.edit"; // 8b7845c1b6e54c5c81c1eebe4ee829d6
	public static final String BG_LOCAL_GOODS_TAX_CODE_GET = "bg.local.goods.tax.code.get"; // 8889947346ec4e57954904955d4dd021
	public static final String BG_LOCAL_GOODS_TEMPLATE_GET = "bg.local.goods.template.get"; // d2379bcb0ff2495c84af5cc9290c337c
	public static final String BG_LOCAL_GOODS_UPDATE = "bg.local.goods.update"; // 9ec69ff253ff4403bed421ca114144ef
	public static final String BG_LOCAL_GOODS_VIDEOCOVERIMAGE_GET = "bg.local.goods.videocoverimage.get"; // 4759c1207d8940bf8dd09eaad1cc853f
	public static final String BG_LOCAL_MALL_INFO_GET = "bg.local.mall.info.get"; // 1f7b545ac66e44d68056770c623559aa
	public static final String TEMU_LOCAL_GOODS_ATTRIBUTES_EDIT = "temu.local.goods.attributes.edit"; // 90209955043043429e771f0c240cdb77
	public static final String TEMU_LOCAL_GOODS_BASEPRICE_RECOMMEND = "temu.local.goods.baseprice.recommend"; // 305d9c1efec640a2bebfc7f2d1062e75
	public static final String TEMU_LOCAL_GOODS_BRAND_TRADEMARK_V2_GET = "temu.local.goods.brand.trademark.V2.get"; // ef32b4d8492542cb8d2e3add1f4c984f
	public static final String TEMU_LOCAL_GOODS_CATS_RULES_GET = "temu.local.goods.cats.rules.get"; // c53c3b98e800409aaacef445d8a0af05
	public static final String TEMU_LOCAL_GOODS_COMPLIANCE_V2_EDIT = "temu.local.goods.compliance.v2.edit"; // 1bb118fa3b47463cb9e8ad04f6277047
	public static final String TEMU_LOCAL_GOODS_DELETE = "temu.local.goods.delete"; // d651ab650f3546fea22874a9d758ffe4
	public static final String TEMU_LOCAL_GOODS_ILLEGAL_VOCABULARY_CHECK = "temu.local.goods.illegal.vocabulary.check"; // 9c7d15d7b0a3487493626f5abebf0ed4
	public static final String TEMU_LOCAL_GOODS_IMAGE_V2_UPLOAD = "temu.local.goods.image.v2.upload"; // feb8c48dc4e841098a53b116cfc30a0f
	public static final String TEMU_LOCAL_GOODS_LIST_RETRIEVE = "temu.local.goods.list.retrieve"; // b13c66e2a08740ecbdcc2f95e2573ac9
	public static final String TEMU_LOCAL_GOODS_MISSING_ATTRIBUTES_GET = "temu.local.goods.missing.attributes.get"; // f4720e6a4e094a8c85b2e342bb6e6694
	public static final String TEMU_LOCAL_GOODS_PRE_SALE_STATUS_EDIT = "temu.local.goods.pre.sale.status.edit"; // c3173683180c42e19b12f48c903e2f98
	public static final String TEMU_LOCAL_GOODS_RECOMMENDEDPRICE_QUERY = "temu.local.goods.recommendedprice.query"; // 345864462c9545be8ad04f23cb0102be
	public static final String TEMU_LOCAL_GOODS_SKU_NET_CONTENT_UNIT_QUERY = "temu.local.goods.sku.net.content.unit.query"; // 1c2f06dcabf348ba9e933406178c6c5b
	public static final String TEMU_LOCAL_GOODS_SKU_STOCK_QUERY = "temu.local.goods.sku.stock.query"; // d2c3a9ad5fe7428b8ac5953b769a2c00
	public static final String TEMU_LOCAL_GOODS_SPEC_INFO_GET = "temu.local.goods.spec.info.get"; // 7e396281b713436c93363864b6b826aa
	public static final String TEMU_LOCAL_GOODS_V2_ADD = "temu.local.goods.v2.add"; // 7c62f868c3e44140a6a9912656bdd577
	public static final String TEMU_LOCAL_GOODS_V3_ADD = "temu.local.goods.v3.add"; // bbeaaebc9c864fa09927ed89a974e74d
	public static final String TEMU_LOCAL_MALL_TAGS_GET = "temu.local.mall.tags.get"; // 994e310a36ca4c7b960632013d05d02a
	public static final String TEMU_LOCAL_ORDER_VERIFICATION_UPLOAD = "temu.local.order.verification.upload"; // 8090778c698047ec83b7e8f4dbdff929
	public static final String TEMU_LOCAL_PRODUCT_ATTRIBUTES_GET = "temu.local.product.attributes.get"; // 218b068fc7794299892109db63529945
	public static final String TEMU_LOCAL_PRODUCT_VARIATION_GET = "temu.local.product.variation.get"; // c423de947cb148c5935cbed997151f0f
	public static final String TEMU_LOCAL_SKU_LIST_RETRIEVE = "temu.local.sku.list.retrieve"; // 4b8fcc68f0f4463ab59225d677301413

	// === LOGISTICS ===
	public static final String BG_LOGISTICS_COMPANIES_GET = "bg.logistics.companies.get"; // 9b931b5ca8e44aad9a0b93cf37288d81
	public static final String BG_LOGISTICS_SHIPMENT_CREATE = "bg.logistics.shipment.create"; // ce696c09d9ba48b4ae4f6e5044339d13
	public static final String BG_LOGISTICS_SHIPMENT_DOCUMENT_GET = "bg.logistics.shipment.document.get"; // 002f7b3c1e554b2e9e76085d0ed9b4a8
	public static final String BG_LOGISTICS_SHIPMENT_RESULT_GET = "bg.logistics.shipment.result.get"; // f3d16dfe528c4daaab132e3b5de43408
	public static final String BG_LOGISTICS_SHIPMENT_SHIPPINGTYPE_UPDATE = "bg.logistics.shipment.shippingtype.update"; // c487c8594e3d4829b582780b0ab43f52
	public static final String BG_LOGISTICS_SHIPMENT_SUB_CONFIRM = "bg.logistics.shipment.sub.confirm"; // b35cb4fec9c349a5b8f71b72ddfa9fb8
	public static final String BG_LOGISTICS_SHIPMENT_UPDATE = "bg.logistics.shipment.update"; // 47a2a81f76e6492b81ba391e331eabb4
	public static final String BG_LOGISTICS_SHIPMENT_V2_CONFIRM = "bg.logistics.shipment.v2.confirm"; // 1e446d01a800438aadade85ffe179c71
	public static final String BG_LOGISTICS_SHIPMENT_V2_GET = "bg.logistics.shipment.v2.get"; // 27e2bb73182348e7b50d49bc8f70fb9e
	public static final String BG_LOGISTICS_SHIPPED_PACKAGE_CONFIRM = "bg.logistics.shipped.package.confirm"; // e99e0a6527cc4abeaf0fa2edbd8baf08
	public static final String BG_LOGISTICS_SHIPPINGSERVICES_GET = "bg.logistics.shippingservices.get"; // effd93aba9b54632afc69eae794614df
	public static final String BG_LOGISTICS_WAREHOUSE_LIST_GET = "bg.logistics.warehouse.list.get"; // 954425969eaf45d4baabb2076a158a4d
	public static final String TEMU_LOGISTICS_CANDIDATE_SCANFORM_LIST_GET = "temu.logistics.candidate.scanform.list.get"; // 00cca42f05ec41e7b425b22db235202f
	public static final String TEMU_LOGISTICS_LABEL_LIST_GET = "temu.logistics.label.list.get"; // 56dd3bd6f84f4efc8d6a1736deedfa8e
	public static final String TEMU_LOGISTICS_SCANFORM_CREATE = "temu.logistics.scanform.create"; // 0dd0f3cd7a5b4ffd9ebdd11955cc0dbc
	public static final String TEMU_LOGISTICS_SCANFORM_DOCUMENT_GET = "temu.logistics.scanform.document.get"; // ed1ea329e1be477e91dfd9b779902fa1
	public static final String TEMU_LOGISTICS_SCANFORM_GET = "temu.logistics.scanform.get"; // 632cb5f46dd543609e1e34fe1d40db42
	public static final String TEMU_LOGISTICS_SELF_DELIVERY_POD_AUDIT_RESULT_GET = "temu.logistics.self.delivery.pod.audit.result.get"; // e7ada01f9b044cf98adc4e5a6ebcfd62
	public static final String TEMU_LOGISTICS_SELF_DELIVERY_POD_UPLOAD = "temu.logistics.self.delivery.pod.upload"; // 39dce790742249f39998ee87eb75e5cf
	public static final String TEMU_LOGISTICS_SELF_DELIVERY_POD_UPLOAD_SIGNATURE_QUERY = "temu.logistics.self.delivery.pod.upload.signature.query"; // b42a002b6a3d42a58aa809cfc1ea14fd
	public static final String TEMU_LOGISTICS_SHIPLOGISTICSTYPE_GET = "temu.logistics.shiplogisticstype.get"; // 8dff824d07ae4a45b577576ef8f18b2b
	public static final String TEMU_LOGISTICS_SHIPMENT_PICKUP_RESERVATION_CANCEL = "temu.logistics.shipment.pickup.reservation.cancel"; // 5c601d90168e495ab1de4ffa8990d501
	public static final String TEMU_LOGISTICS_SHIPMENT_PICKUP_RESERVATION_CREATE = "temu.logistics.shipment.pickup.reservation.create"; // 292400cff14a43d3b15d5405e5d5dfea
	public static final String TEMU_LOGISTICS_SHIPMENT_PICKUP_RESERVATION_RESULT_GET = "temu.logistics.shipment.pickup.reservation.result.get"; // 57aeec56d19c4dfe8117ef39888fe195

	// === OLAF ===
	public static final String TEMU_OLAF_AUTH_REP_CREATE = "temu.olaf.auth.rep.create"; // 46027bd3a20246b3bf0abd404654530b
	public static final String TEMU_OLAF_AUTH_REP_UPLOAD = "temu.olaf.auth.rep.upload"; // e541f3aab31b4481a2f052ba07d674db

	// === OPEN ===
	public static final String BG_OPEN_ACCESSTOKEN_CREATE = "bg.open.accesstoken.create"; // 71b75a21362544b6b8975b9f4c3bc8eb
	public static final String BG_OPEN_ACCESSTOKEN_INFO_GET = "bg.open.accesstoken.info.get"; // 86aa980f05264a53a8f5634386399469

	// === ORDER ===
	public static final String BG_ORDER_AMOUNT_QUERY = "bg.order.amount.query"; // 4592ac61eebf48019b4f552ba8bd2aed
	public static final String BG_ORDER_COMBINEDSHIPMENT_LIST_GET = "bg.order.combinedshipment.list.get"; // a7bf866b7b2e4be8b1ab512741ea697a
	public static final String BG_ORDER_CUSTOMIZATION_GET = "bg.order.customization.get"; // 7d84f1205bdf46d8bee33e665298ca66
	public static final String BG_ORDER_DECRYPTSHIPPINGINFO_GET = "bg.order.decryptshippinginfo.get"; // 455ba8d355ad4010a255b663ef8e0033
	public static final String BG_ORDER_DETAIL_V2_GET = "bg.order.detail.v2.get"; // 664513366d1e4801898885a8d729bddb
	public static final String BG_ORDER_LIST_V2_GET = "bg.order.list.v2.get"; // fedc6e0e3eed44c9b479842507bcd938
	public static final String BG_ORDER_SHIPPINGINFO_V2_GET = "bg.order.shippinginfo.v2.get"; // 9d78687fe6ec485b8d96a128f408d49b
	public static final String BG_ORDER_UNSHIPPED_PACKAGE_GET = "bg.order.unshipped.package.get"; // 3ef9cd3bb2214dcc9e5cc0d743ec1066
	public static final String TEMU_ORDER_AMOUNT_V2_QUERY = "temu.order.amount.v2.query"; // 91661bf0642440ddbd462b25fa96edfb
	public static final String TEMU_ORDER_AMOUNT_V3_QUERY = "temu.order.amount.v3.query"; // 3ffe9c4c79b9418285eb7ec09cf7b329
	public static final String TEMU_ORDER_CANCEL_APPEAL_APPLY = "temu.order.cancel.appeal.apply"; // a3af61e9809c42d691e2094d6af2e475
	public static final String TEMU_ORDER_CANCEL_APPEAL_RESULT_GET = "temu.order.cancel.appeal.result.get"; // f4eb7b1f1aff4188ae3b68fb00b617c3
	public static final String TEMU_ORDER_CANCEL_OUTOFSTOCK_APPLY = "temu.order.cancel.outofstock.apply"; // b7904d2632e24d10bbeabc3c86e7eacc
	public static final String TEMU_ORDER_CANCEL_OUTOFSTOCK_RESULT_GET = "temu.order.cancel.outofstock.result.get"; // 0245fe9188bd42b9ba4be220a8cf7293

	// === PAY ===
	public static final String TEMU_PAY_TAX_APPLY_EXPORT_REPORT = "temu.pay.tax.apply.export.report"; // 6494bb7afd8048d380a13e92f6275d17
	public static final String TEMU_PAY_TAX_GET_GALERIE_SIGNATURE = "temu.pay.tax.get.galerie.signature"; // d6147c0484a341c49790b6dfed7da275
	public static final String TEMU_PAY_TAX_INVOICE_DETAIL_QUERY = "temu.pay.tax.invoice.detail.query"; // 3985fe93bff5437c87863a22112b72db
	public static final String TEMU_PAY_TAX_INVOICE_INFO_QUERY = "temu.pay.tax.invoice.info.query"; // 5f5d1168742b4991a86684cbd0c21489
	public static final String TEMU_PAY_TAX_INVOICE_PDF_DOWNLOAD = "temu.pay.tax.invoice.pdf.download"; // 2b8a5a8a75604779b2e0017ee79b462a
	public static final String TEMU_PAY_TAX_MERCHANT_REPORT_DOWNLOAD = "temu.pay.tax.merchant.report.download"; // cc87994f2ac24fc88795f2a3a8844683
	public static final String TEMU_PAY_TAX_MERCHANT_UPLOAD_INVOICE = "temu.pay.tax.merchant.upload.invoice"; // 98fcf420ee5c4f0d8c8f708adfd89160

	// === PROMOTION ===
	public static final String BG_PROMOTION_ACTIVITY_CANDIDATE_GOODS_QUERY = "bg.promotion.activity.candidate.goods.query"; // d41d97d32a1849f18e7b689ab4dd955e
	public static final String BG_PROMOTION_ACTIVITY_GOODS_ENROLL = "bg.promotion.activity.goods.enroll"; // 64d40dfc2a724dbabde86701c7b8e299
	public static final String BG_PROMOTION_ACTIVITY_GOODS_OPERATION_QUERY = "bg.promotion.activity.goods.operation.query"; // 3722938ff7384681ad38adf1db6ca6cf
	public static final String BG_PROMOTION_ACTIVITY_GOODS_QUERY = "bg.promotion.activity.goods.query"; // bfd4de5e2b504754a1d2721581b6f924
	public static final String BG_PROMOTION_ACTIVITY_GOODS_UPDATE = "bg.promotion.activity.goods.update"; // aa8c8201471e48a2a44c97200e1066ea
	public static final String BG_PROMOTION_ACTIVITY_QUERY = "bg.promotion.activity.query"; // 786d831b2dd643a981ce3f3355e0b54f

	// === RESEARCH ===
	public static final String TEMU_RESEARCH_ADS_LIB_QUERY = "temu.research.ads.lib.query"; // d25d6db013e34fcaa49f2d800facd425
	public static final String TEMU_RESEARCH_GOODS_REVIEWS_QUERY = "temu.research.goods.reviews.query"; // c04d1f99c6864327a5c6ee8b2e8ee739
	public static final String TEMU_RESEARCH_MALL_GOODS_QUERY = "temu.research.mall.goods.query"; // 4528d74753ee409a97bf025d56a687ac
	public static final String TEMU_RESEARCH_MALL_INFO_QUERY = "temu.research.mall.info.query"; // f11da3732aef4169b7057511ad17fe51
	public static final String TEMU_RESEARCH_SOR_QUERY = "temu.research.sor.query"; // 1cd73abec5ba49bbbe19d6e35a545d0b

	// === SEARCHREC ===
	public static final String TEMU_SEARCHREC_AD_CREATE = "temu.searchrec.ad.create"; // 0d73b5cfce354892910ea8ae42b80ca2
	public static final String TEMU_SEARCHREC_AD_DETAIL_QUERY = "temu.searchrec.ad.detail.query"; // 57a7511a87b74aa0b2e5d8fb5e4511e3
	public static final String TEMU_SEARCHREC_AD_GOODS_CREATE_QUERY = "temu.searchrec.ad.goods.create.query"; // f91fff14b1fb4a96bf2e7cca66d162f6
	public static final String TEMU_SEARCHREC_AD_LOG_QUERY = "temu.searchrec.ad.log.query"; // 4955914b510046ce99cdc0a48208e018
	public static final String TEMU_SEARCHREC_AD_MODIFY = "temu.searchrec.ad.modify"; // 48068824ab964c1e8c0a9f2c51f17d45
	public static final String TEMU_SEARCHREC_AD_REPORTS_GOODS_QUERY = "temu.searchrec.ad.reports.goods.query"; // 33987f632c0b41a9825a00235414f524
	public static final String TEMU_SEARCHREC_AD_REPORTS_MALL_QUERY = "temu.searchrec.ad.reports.mall.query"; // 8c4f313101e54d569c29807acca5315f
	public static final String TEMU_SEARCHREC_AD_ROAS_PRED = "temu.searchrec.ad.roas.pred"; // 41222f7a0bad44f0a3f9102f1e8ee7db

	// === TMC ===
	public static final String BG_TMC_MESSAGE_UPDATE = "bg.tmc.message.update"; // 014665df2c9a4c498794c5c478b1a84e

	// === TRACK ===
	public static final String TEMU_TRACK_TRACKINGINFO_GET = "temu.track.trackinginfo.get"; // ceda9a0b8faf43e296ef5fac2a57eb30
}
