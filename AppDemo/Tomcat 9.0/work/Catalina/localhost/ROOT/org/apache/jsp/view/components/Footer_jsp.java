/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.36
 * Generated at: 2020-06-15 09:15:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.view.components;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<footer>\r\n");
      out.write("\t<section class=\"footer-section ptb-100\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-5 col-md-6 col-sm-6\">\r\n");
      out.write("\t\t\t\t\t<div class=\"footer-area\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"footer-heading\">\r\n");
      out.write("\t\t\t\t\t\t\t<h3>About Us</h3>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<p>We are the OOT team, and are students of K12, Faculty of\r\n");
      out.write("\t\t\t\t\t\t\tInformation Technology, University of Information Technology. If\r\n");
      out.write("\t\t\t\t\t\t\tyou feel enjoying our project. Let's like and follow us through\r\n");
      out.write("\t\t\t\t\t\t\tour social networking site below.</p>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"footer-social\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"bg-3955bc\"> <i\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"fa fa-facebook\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"bg-1da1f2\"> <i\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"fa fa-twitter\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"bg-004dff\"> <i\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"fa fa-google-plus\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"bg-0273af\"> <i\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"fa fa-envelope\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-3 col-md-6 col-sm-6\">\r\n");
      out.write("\t\t\t\t\t<div class=\"footer-item-area\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"footer-heading\">\r\n");
      out.write("\t\t\t\t\t\t\t<h3>Important Links</h3>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"footer-quick-links\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"TrangChu\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"Courses\">Courses</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"Blogs\">Blogs</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"About\">About</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-4 col-md-6 col-sm-6\">\r\n");
      out.write("\t\t\t\t\t<div class=\"footer-heading\">\r\n");
      out.write("\t\t\t\t\t\t<h3>Contact</h3>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"footer-quick-links\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"footer-info-contact\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"flaticon-call-answer\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t<h3>Phone</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<span>0359070926</span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"footer-info-contact\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"flaticon-envelope\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t<h3>Email</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<span><a href=\"#\">ootteam@gmail.com</a></span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"footer-info-contact\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"flaticon-placeholder-filled-point\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t<h3>Address</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<span>Quarter 6, Linh Trung Ward, District Thu Duc, Ho Chi\r\n");
      out.write("\t\t\t\t\t\t\t\tMinh city.</span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"default-animation\">\r\n");
      out.write("\t\t\t<div class=\"shape-img1\">\r\n");
      out.write("\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${url}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/shape/12.svg\" alt=\"image\" />\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"shape-img2\">\r\n");
      out.write("\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${url}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/shape/13.svg\" alt=\"image\" />\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"shape-img3\">\r\n");
      out.write("\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${url}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/shape/14.png\" alt=\"image\" />\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"shape-img4\">\r\n");
      out.write("\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${url}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/shape/15.png\" alt=\"image\" />\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"shape-img5\">\r\n");
      out.write("\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${url}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/shape/2.png\" alt=\"image\" />\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</section>\r\n");
      out.write("\t<!-- End Footer Section -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- Start Copy Right Section -->\r\n");
      out.write("\t<div class=\"copyright-area\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row align-items-center\">\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-6 col-md-6\">\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\tÂ© 2020 OOT. All Rights Reserved by <a\r\n");
      out.write("\t\t\t\t\t\t\thref=\"https://envytheme.com/\" target=\"_blank\">OOT team</a>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-6 col-md-6\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Terms & Conditions</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Privacy Policy</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</footer>");
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
      // /view/components/Footer.jsp(2,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setValue("/view/assets/img");
      // /view/components/Footer.jsp(2,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
