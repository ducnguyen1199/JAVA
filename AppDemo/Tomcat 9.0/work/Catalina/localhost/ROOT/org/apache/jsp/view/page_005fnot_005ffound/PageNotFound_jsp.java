/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.36
 * Generated at: 2020-06-15 09:29:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.view.page_005fnot_005ffound;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PageNotFound_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/Program%20Files/Apache%20Software%20Foundation/Tomcat%209.0/webapps/ROOT/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153359882000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1591882176000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/view/Html/Head.jsp", out, false);
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"wrapper\">\r\n");
      out.write("\t\t<div class=\"pn-logo\">\r\n");
      out.write("\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/TrangChu\">\r\n");
      out.write("\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${url}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/logo-oot.PNG\" class=\"img-fluid logo\" alt=\"\" />\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"composition\">\r\n");
      out.write("\t\t\t<div class=\"layer-0 shelf\">\r\n");
      out.write("\t\t\t\t<div class=\"shelf__side_left\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"shelf__side_bottom\"></div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"case case_1\">\r\n");
      out.write("\t\t\t\t\t<div class=\"case__front\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__top\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__label case__label_right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__number\">№2428506</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"case case_2\">\r\n");
      out.write("\t\t\t\t\t<div class=\"case__front\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__top\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__label case__label_left\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__number\">№2428506</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"case case_3\">\r\n");
      out.write("\t\t\t\t\t<div class=\"case__front\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__top\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__label case__label_right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__number\">№2428506</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"case case_4\">\r\n");
      out.write("\t\t\t\t\t<div class=\"case__front\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__top\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__label case__label_left\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__number\">№2428506</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"case case_5\">\r\n");
      out.write("\t\t\t\t\t<div class=\"case__front\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__top\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__label case__label_left\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__number\">№2428506</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"case case_6\">\r\n");
      out.write("\t\t\t\t\t<div class=\"case__front\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__top\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__label case__label_right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__number\">№2428506</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"case case_7\">\r\n");
      out.write("\t\t\t\t\t<div class=\"case__front\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__top\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__label case__label_left\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__number\">№2428506</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"case case_8\">\r\n");
      out.write("\t\t\t\t\t<div class=\"case__front\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__top\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__label case__label_left\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__number\">№2428506</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"case case_9\">\r\n");
      out.write("\t\t\t\t\t<div class=\"case__front\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__top\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__label case__label_left\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__number\">№2428506</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"case case_10\">\r\n");
      out.write("\t\t\t\t\t<div class=\"case__front\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__top\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__label case__label_left\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__number\">№2428506</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"case case_11\">\r\n");
      out.write("\t\t\t\t\t<div class=\"case__front\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__top\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__label case__label_left\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__number\">№2428506</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"case case_12\">\r\n");
      out.write("\t\t\t\t\t<div class=\"case__front\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__top\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__label case__label_left\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__number\">№2428506</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"case case_13\">\r\n");
      out.write("\t\t\t\t\t<div class=\"case__front\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__top\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__label case__label_left\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__number\">№2428506</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"case case_14\">\r\n");
      out.write("\t\t\t\t\t<div class=\"case__front\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__top\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__label case__label_left\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__number\">№2428506</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"case case_15\">\r\n");
      out.write("\t\t\t\t\t<div class=\"case__front\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__top\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__label case__label_right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__number\">№2428506</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"case case_16\">\r\n");
      out.write("\t\t\t\t\t<div class=\"case__front\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__top\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__label case__label_left\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__number\">№2428506</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"case case_17\">\r\n");
      out.write("\t\t\t\t\t<div class=\"case__front\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__top\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__label case__label_right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__number\">№2428506</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"case case_18\">\r\n");
      out.write("\t\t\t\t\t<div class=\"case__front\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__top\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__label case__label_left\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__number\">№2428506</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"case case_19\">\r\n");
      out.write("\t\t\t\t\t<div class=\"case__front\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__top\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__label case__label_right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__number\">№2428506</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"case case_20\">\r\n");
      out.write("\t\t\t\t\t<div class=\"case__front\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__top\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__label case__label_right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__number\">№2428506</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"case case_21\">\r\n");
      out.write("\t\t\t\t\t<div class=\"case__front\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__top\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__label case__label_left\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__number\">№2428506</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"case case_22\">\r\n");
      out.write("\t\t\t\t\t<div class=\"case__front\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__top\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__label case__label_right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__number\">№2428506</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"case case_23\">\r\n");
      out.write("\t\t\t\t\t<div class=\"case__front\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__top\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__label case__label_left\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__number\">№2428506</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"case case_24\">\r\n");
      out.write("\t\t\t\t\t<div class=\"case__front\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__top\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__label case__label_right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__number\">№2428506</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"case case_25\">\r\n");
      out.write("\t\t\t\t\t<div class=\"case__front\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__top\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__label case__label_left\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__number\">№2428506</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"case case_26\">\r\n");
      out.write("\t\t\t\t\t<div class=\"case__front\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__top\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__label case__label_right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__number\">№2428506</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"case case_27\">\r\n");
      out.write("\t\t\t\t\t<div class=\"case__front\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__top\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__label case__label_right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__number\">№2428506</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"case case_28\">\r\n");
      out.write("\t\t\t\t\t<div class=\"case__front\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__top\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__label case__label_left\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__number\">№2428506</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"case case_29\">\r\n");
      out.write("\t\t\t\t\t<div class=\"case__front\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__top\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__label case__label_left\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__number\">№2428506</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"case case_30\">\r\n");
      out.write("\t\t\t\t\t<div class=\"case__front\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__top\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__label case__label_left\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__number\">№2428506</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"case case_31\">\r\n");
      out.write("\t\t\t\t\t<div class=\"case__front\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__top\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__label case__label_right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__number\">№2428506</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"case case_32\">\r\n");
      out.write("\t\t\t\t\t<div class=\"case__front\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__top\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__label case__label_left\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__number\">№2428506</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"case case_33\">\r\n");
      out.write("\t\t\t\t\t<div class=\"case__front\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__top\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__label case__label_right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__number\">№2428506</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"case case_34\">\r\n");
      out.write("\t\t\t\t\t<div class=\"case__front\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__top\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__label case__label_right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__number\">№2428506</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"case case_35\">\r\n");
      out.write("\t\t\t\t\t<div class=\"case__front\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__top\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__label case__label_left\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__number\">№2428506</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"case case_36\">\r\n");
      out.write("\t\t\t\t\t<div class=\"case__front\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__top\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__label case__label_right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__number\">№2428506</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"case case_37\">\r\n");
      out.write("\t\t\t\t\t<div class=\"case__front\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__top\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__label case__label_left\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__number\">№2428506</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"case case_38\">\r\n");
      out.write("\t\t\t\t\t<div class=\"case__front\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__top\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__label case__label_right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__number\">№2428506</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"case case_39\">\r\n");
      out.write("\t\t\t\t\t<div class=\"case__front\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__top\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__label case__label_left\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__number\">№2428506</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"case case_40\">\r\n");
      out.write("\t\t\t\t\t<div class=\"case__front\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__top\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__label case__label_right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__number\">№2428506</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"case case_41\">\r\n");
      out.write("\t\t\t\t\t<div class=\"case__front\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__top\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__label case__label_left\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__number\">№2428506</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"case case_42\">\r\n");
      out.write("\t\t\t\t\t<div class=\"case__front\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__top\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__label case__label_right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__number\">№2428506</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"case case_43\">\r\n");
      out.write("\t\t\t\t\t<div class=\"case__front\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__top\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__label case__label_left\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__number\">№2428506</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"case case_44\">\r\n");
      out.write("\t\t\t\t\t<div class=\"case__front\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__top\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__label case__label_right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__number\">№2428506</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"case case_45\">\r\n");
      out.write("\t\t\t\t\t<div class=\"case__front\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__top\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__label case__label_left\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__number\">№2428506</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"case case_46\">\r\n");
      out.write("\t\t\t\t\t<div class=\"case__front\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__top\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__label case__label_right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__number\">№2428506</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"case case_47\">\r\n");
      out.write("\t\t\t\t\t<div class=\"case__front\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__top\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__label case__label_left\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__right\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"case__number\">№2428506</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"glow\">\r\n");
      out.write("\t\t\t\t\t<div class=\"glow__bottom\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"glow__top\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"glow__ball glow__ball_1\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"glow__ball glow__ball_2\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"glow__ball glow__ball_3\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"glow__ball glow__ball_4\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"glow__ball glow__ball_5\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"glow__ball glow__ball_6\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"glow__ball glow__ball_7\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"glow__ball glow__ball_8\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"glow__ball glow__ball_9\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"glow__ball glow__ball_10\"></div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"shelf__side_front\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"shelf__side_right\"></div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"shelf__handle_top\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"shelf__handle_front\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"shelf__handle_right\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"layer-1 shadow\"></div>\r\n");
      out.write("\t\t\t<div class=\"layer-2 numbers\">\r\n");
      out.write("\t\t\t\t<div class=\"numbers__item numbers__item_1\">4</div>\r\n");
      out.write("\t\t\t\t<div class=\"numbers__item numbers__item_2\">0</div>\r\n");
      out.write("\t\t\t\t<div class=\"numbers__item numbers__item_3\">4</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<a class=\"fill\" href=\"");
      out.print(request.getContextPath());
      out.write("/TrangChu\">GO BACK HOME</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/view/Html/Script.jsp", out, false);
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f0_reused = false;
    try {
      _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f0.setParent(null);
      // /view/page_not_found/PageNotFound.jsp(4,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setValue("/view/assets/img");
      // /view/page_not_found/PageNotFound.jsp(4,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setVar("url");
      int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
      if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      _jspx_th_c_005furl_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f0, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f0_reused);
    }
    return false;
  }
}
