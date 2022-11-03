package com.repostapp.abastecimiento.TestNG;

import org.openqa.selenium.By;


public class Abastecimiento {
	
	//Localizadores
    ////////////////////////////////Test1////Realizar Solicitud lado solicitador
	
	By RepostAppPageLocator = By.xpath("/html/body/app-root/app-auth/div/div[2]/nz-card/div[1]/div/div");
	By UserNameLocator = By.xpath("/html/body/app-root/app-auth/div/div[2]/nz-card/div[2]/form/nz-form-item[1]/nz-form-control/div/div/input");
	By PasswordLocator = By.xpath("/html/body/app-root/app-auth/div/div[2]/nz-card/div[2]/form/nz-form-item[2]/nz-form-control/div/div/input");
	By BtnEntrar = By.xpath("/html/body/app-root/app-auth/div/div[2]/nz-card/div[2]/form/button");
	By HomePageLocator = By.xpath("/html/body/app-root/app-home/nz-layout/nz-sider/div/div/div/span[1]/img");
	By BtnRealizarSolicitud = By.xpath("/html/body/app-root/app-home/nz-layout/nz-sider/div/ul/li[1]/span/a");
	By dropdownList_TipoSolicitud = By.xpath("/html/body/app-root/app-home/nz-layout/nz-layout/nz-content/div/app-realizar-solicitud/div/div[2]/nz-card/div[2]/nz-select/nz-select-top-control/nz-select-item");
	By OptionConsolidado = By.xpath("//*[@id=\"cdk-overlay-1\"]/nz-option-container/div/cdk-virtual-scroll-viewport/div[1]/nz-option-item[3]/div");
	By ElementPresent = By.xpath("/html/body/app-root/app-home/nz-layout/nz-layout/nz-content/div/app-realizar-solicitud/div/div[1]/div[1]/nz-card/div[1]/div/div");
	By CodigoProducto = By.xpath("//nz-select");
	By TextBoxProduct = By.xpath("//nz-select/nz-select-top-control/nz-select-search/input");
	By Cantidad = By.xpath("//div[@class= 'ant-input-number-input-wrap']/input");
	By BtnAgregar = By.xpath("/html/body/app-root/app-home/nz-layout/nz-layout/nz-content/div/app-realizar-solicitud/div/div[1]/div[1]/nz-card/div[2]/form/nz-form-item[3]/button/span");
	By BtnSolicitar = By.xpath("/html/body/app-root/app-home/nz-layout/nz-layout/nz-content/div/app-realizar-solicitud/div/div[2]/button[2]/span");
	By AccionBorrar = By.xpath("/html/body/app-root/app-home/nz-layout/nz-layout/nz-content/div/app-realizar-solicitud/div/nz-card/div[2]/nz-table/nz-spin/div/div/nz-table-inner-scroll/div/table/tbody/tr[2]/td[7]/button");
	By NumeroSolicitud = By.xpath("/html/body/app-root/app-home/nz-layout/nz-layout/nz-content/div/app-realizar-solicitud/div/div[1]/div[2]/nz-card/div[2]/span");
	

	////////////////////////////////Test2/////Trabajar Solicitud lado Sacador
	
	By BtnTrabajarSolicitudes = By.xpath("/html/body/app-root/app-home/nz-layout/nz-sider/div/ul/li[1]/span/a");
	By PendienteTrabajar = By.xpath("/html/body/app-root/app-home/nz-layout/nz-layout/nz-content/div/app-trabajar-solicitudes/div/div[1]/nz-card/div/h4");
	By FiltrarSolicitud = By.name("search");
	By BtnVer = By.xpath("/html/body/app-root/app-home/nz-layout/nz-layout/nz-content/div/app-trabajar-solicitudes/nz-card/div[2]/nz-table/nz-spin/div/div/nz-table-inner-default/div/table/tbody/tr[1]/td[5]/button");
	By ProductoSacador = By.xpath("//*[@id=\"cdk-overlay-1\"]/nz-option-container/div/cdk-virtual-scroll-viewport/div[1]/nz-option-item/div");
	By CantidadTrabajar = By.xpath("/html/body/app-root/app-home/nz-layout/nz-layout/nz-content/div/app-trabajar-solicitud/div[1]/div[1]/nz-card/div[2]/form/nz-form-item[2]/nz-input-number/div[2]");
	By CheckList = By.xpath("/html/body/app-root/app-home/nz-layout/nz-layout/nz-content/div/app-trabajar-solicitud/div[1]/div[1]/nz-card/div[2]/form/nz-form-item[3]/button");
	
	////////////////////////////////Test3/////Solicitar cambio de lote lado sacador
	
	By BtnCambiarLote = By.xpath("/html/body/app-root/app-home/nz-layout/nz-layout/nz-content/div/app-trabajar-solicitud/nz-card/div/nz-table/nz-spin/div/div/nz-table-inner-scroll/div/table/tbody/tr[2]/td[9]/button");
	By BtnTipoLote = By.xpath("//*[@id=\"cdk-overlay-1\"]/nz-modal-container/div/div/div[2]/div/div[1]/nz-card/div/form/nz-input-group[2]/div/div[1]/nz-input-group/span/nz-select/nz-select-top-control/nz-select-search/input");
	By Total = By.xpath("//*[@id=\"cdk-overlay-4\"]/nz-option-container/div/cdk-virtual-scroll-viewport/div[1]/nz-option-item[1]/div");
	By Parcial = By.xpath("//*[@id=\"cdk-overlay-2\"]/nz-option-container/div/cdk-virtual-scroll-viewport/div[1]/nz-option-item[2]/div");
	By TextBoxCantSolicitad = By.xpath("//*[@id=\"cdk-overlay-1\"]/nz-modal-container/div/div/div[2]/div/div[1]/nz-card/div/form/nz-input-group[2]/div/div[2]/nz-input-group/span/nz-input-number/div[2]/input");
	By TextBoxLoteNuevo = By.xpath("//*[@id=\"cdk-overlay-1\"]/nz-modal-container/div/div/div[2]/div/div[1]/nz-card/div/form/nz-input-group[3]/div/div[2]/nz-input-group/span/nz-select/nz-select-top-control/nz-select-search/input");
	By LoteNuevo = By.xpath("//*[@id=\"cdk-overlay-3\"]/nz-option-container/div/cdk-virtual-scroll-viewport/div[1]/nz-option-item[4]/div");
	By TextBoxMotivos = By.xpath("//*[@id=\"cdk-overlay-1\"]/nz-modal-container/div/div/div[2]/div/div[1]/nz-card/div/form/nz-input-group[5]/div/div[1]/nz-input-group/span/nz-select/nz-select-top-control/nz-select-search");
	By Motivo = By.xpath("//*[@id=\"cdk-overlay-4\"]/nz-option-container/div/cdk-virtual-scroll-viewport/div[1]/nz-option-item[4]");
	By BtnSolicitarCL = By.xpath("//*[@id=\"cdk-overlay-1\"]/nz-modal-container/div/div/div[3]/button[3]");
	By NoSolicitud = By.xpath("/html/body/app-root/app-home/nz-layout/nz-layout/nz-content/div/app-realizar-solicitud/div/div[1]/div[2]/nz-card/div[2]/span");
	By BtnCompletar = By.xpath("/html/body/app-root/app-home/nz-layout/nz-layout/nz-content/div/app-trabajar-solicitud/div[2]/button[3]/span");
	By EnProgreso = By.xpath("/html/body/app-root/app-home/nz-layout/nz-layout/nz-content/div/app-trabajar-solicitudes/div/div[2]/nz-card/div/h4");
	
	////////////////////////////////Test4/////Aprobar Solicitudes lado Admin
	
	By ConsultaSolicitud = By.xpath("/html/body/app-root/app-home/nz-layout/nz-sider/div/ul/li[3]/span/a");
	By SolicitudEspera = By.xpath("/html/body/app-root/app-home/nz-layout/nz-layout/nz-content/div/app-consulta-solicitudes/div/div[3]/nz-card/div/h4");
	By BtnAprobar = By.xpath("/html/body/app-root/app-home/nz-layout/nz-layout/nz-content/div/app-solicitudes-detalle/nz-card/div[2]/nz-table/nz-spin/div/div/nz-table-inner-scroll/div/table/tbody/tr[2]/td[13]/button");
	By BtnVerAdmin = By.xpath("/html/body/app-root/app-home/nz-layout/nz-layout/nz-content/div/app-consulta-solicitudes/nz-card/div[2]/nz-table/nz-spin/div/div/nz-table-inner-default/div/table/tbody/tr[1]/td[3]/button");
	By BtnAceptar = By.xpath("//*[@id=\"cdk-overlay-1\"]/nz-modal-confirm-container/div/div/div/div/div[2]/button[2]");
	By EnviadoRecepcion = By.xpath("/html/body/app-root/app-home/nz-layout/nz-layout/nz-content/div/app-consulta-solicitudes/div/div[4]/nz-card/div/h4");
}

	
	
