### description
#### Decorator Pattern (装饰者模式)
严格遵守开闭原则，扩展一个类的功能。
Decorator Pattern叫装饰模式，或装饰者模式，以前叫包装器模式（Wrapper，GoF在92-93年由Wrapper改为Decorator）。
装饰模式是在不必改变原类文件和使用继承的情况下，动态地扩展一个对象的功能。它是通过创建一个包装对象，也就是装饰来包裹真实的对象。

如果说在JDK有什么有哪些地方是由使用到的话，那是暂时还不知道了。但是有时候对于源码，还是要硬着头皮去研究的，否则，自己将是一事无成了。
这边看了有HttpServletRequestWrapper类使用了这种模式，但是里面的具体的实现似乎都是继承的父类的实现。
```java
/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package javax.servlet.http;

import java.io.IOException;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.ServletRequestWrapper;

/**
 * Provides a convenient implementation of the HttpServletRequest interface that
 * can be subclassed by developers wishing to adapt the request to a Servlet.
 * This class implements the Wrapper or Decorator pattern. Methods default to
 * calling through to the wrapped request object.
 *
 * @see javax.servlet.http.HttpServletRequest
 * @since v 2.3
 */
public class HttpServletRequestWrapper extends ServletRequestWrapper implements
        HttpServletRequest {

    /**
     * Constructs a request object wrapping the given request.
     *
     * @param request The request to wrap
     *
     * @throws java.lang.IllegalArgumentException
     *             if the request is null
     */
    public HttpServletRequestWrapper(HttpServletRequest request) {
        super(request);
    }

    private HttpServletRequest _getHttpServletRequest() {
        return (HttpServletRequest) super.getRequest();
    }

    /**
     * The default behavior of this method is to return getAuthType() on the
     * wrapped request object.
     */
    @Override
    public String getAuthType() {
        return this._getHttpServletRequest().getAuthType();
    }

    /**
     * The default behavior of this method is to return getCookies() on the
     * wrapped request object.
     */
    @Override
    public Cookie[] getCookies() {
        return this._getHttpServletRequest().getCookies();
    }

    /**
     * The default behavior of this method is to return getDateHeader(String
     * name) on the wrapped request object.
     */
    @Override
    public long getDateHeader(String name) {
        return this._getHttpServletRequest().getDateHeader(name);
    }

    /**
     * The default behavior of this method is to return getHeader(String name)
     * on the wrapped request object.
     */
    @Override
    public String getHeader(String name) {
        return this._getHttpServletRequest().getHeader(name);
    }

    /**
     * The default behavior of this method is to return getHeaders(String name)
     * on the wrapped request object.
     */
    @Override
    public Enumeration<String> getHeaders(String name) {
        return this._getHttpServletRequest().getHeaders(name);
    }

    /**
     * The default behavior of this method is to return getHeaderNames() on the
     * wrapped request object.
     */
    @Override
    public Enumeration<String> getHeaderNames() {
        return this._getHttpServletRequest().getHeaderNames();
    }

    /**
     * The default behavior of this method is to return getIntHeader(String
     * name) on the wrapped request object.
     */
    @Override
    public int getIntHeader(String name) {
        return this._getHttpServletRequest().getIntHeader(name);
    }

    /**
     * The default behavior of this method is to return
     * {@link HttpServletRequest#getHttpServletMapping()} on the wrapped request
     * object.
     *
     * @since Servlet 4.0
     */
    @Override
    public HttpServletMapping getHttpServletMapping() {
        return this._getHttpServletRequest().getHttpServletMapping();
    }

    /**
     * The default behavior of this method is to return getMethod() on the
     * wrapped request object.
     */
    @Override
    public String getMethod() {
        return this._getHttpServletRequest().getMethod();
    }

    /**
     * The default behavior of this method is to return getPathInfo() on the
     * wrapped request object.
     */
    @Override
    public String getPathInfo() {
        return this._getHttpServletRequest().getPathInfo();
    }

    /**
     * The default behavior of this method is to return getPathTranslated() on
     * the wrapped request object.
     */
    @Override
    public String getPathTranslated() {
        return this._getHttpServletRequest().getPathTranslated();
    }

    /**
     * The default behavior of this method is to return getContextPath() on the
     * wrapped request object.
     */
    @Override
    public String getContextPath() {
        return this._getHttpServletRequest().getContextPath();
    }

    /**
     * The default behavior of this method is to return getQueryString() on the
     * wrapped request object.
     */
    @Override
    public String getQueryString() {
        return this._getHttpServletRequest().getQueryString();
    }

    /**
     * The default behavior of this method is to return getRemoteUser() on the
     * wrapped request object.
     */
    @Override
    public String getRemoteUser() {
        return this._getHttpServletRequest().getRemoteUser();
    }

    /**
     * The default behavior of this method is to return isUserInRole(String
     * role) on the wrapped request object.
     */
    @Override
    public boolean isUserInRole(String role) {
        return this._getHttpServletRequest().isUserInRole(role);
    }

    /**
     * The default behavior of this method is to return getUserPrincipal() on
     * the wrapped request object.
     */
    @Override
    public java.security.Principal getUserPrincipal() {
        return this._getHttpServletRequest().getUserPrincipal();
    }

    /**
     * The default behavior of this method is to return getRequestedSessionId()
     * on the wrapped request object.
     */
    @Override
    public String getRequestedSessionId() {
        return this._getHttpServletRequest().getRequestedSessionId();
    }

    /**
     * The default behavior of this method is to return getRequestURI() on the
     * wrapped request object.
     */
    @Override
    public String getRequestURI() {
        return this._getHttpServletRequest().getRequestURI();
    }

    /**
     * The default behavior of this method is to return getRequestURL() on the
     * wrapped request object.
     */
    @Override
    public StringBuffer getRequestURL() {
        return this._getHttpServletRequest().getRequestURL();
    }

    /**
     * The default behavior of this method is to return getServletPath() on the
     * wrapped request object.
     */
    @Override
    public String getServletPath() {
        return this._getHttpServletRequest().getServletPath();
    }

    /**
     * The default behavior of this method is to return getSession(boolean
     * create) on the wrapped request object.
     */
    @Override
    public HttpSession getSession(boolean create) {
        return this._getHttpServletRequest().getSession(create);
    }

    /**
     * The default behavior of this method is to return getSession() on the
     * wrapped request object.
     */
    @Override
    public HttpSession getSession() {
        return this._getHttpServletRequest().getSession();
    }

    /**
     * The default behavior of this method is to call changeSessionId() on the
     * wrapped request object.
     */
    @Override
    public String changeSessionId() {
        return this._getHttpServletRequest().changeSessionId();
    }

    /**
     * The default behavior of this method is to return
     * isRequestedSessionIdValid() on the wrapped request object.
     */
    @Override
    public boolean isRequestedSessionIdValid() {
        return this._getHttpServletRequest().isRequestedSessionIdValid();
    }

    /**
     * The default behavior of this method is to return
     * isRequestedSessionIdFromCookie() on the wrapped request object.
     */
    @Override
    public boolean isRequestedSessionIdFromCookie() {
        return this._getHttpServletRequest().isRequestedSessionIdFromCookie();
    }

    /**
     * The default behavior of this method is to return
     * isRequestedSessionIdFromURL() on the wrapped request object.
     */
    @Override
    public boolean isRequestedSessionIdFromURL() {
        return this._getHttpServletRequest().isRequestedSessionIdFromURL();
    }

    /**
     * The default behavior of this method is to return
     * isRequestedSessionIdFromUrl() on the wrapped request object.
     *
     * @deprecated As of Version 3.0 of the Java Servlet API
     */
    @Override
    @Deprecated
    public boolean isRequestedSessionIdFromUrl() {
        return this._getHttpServletRequest().isRequestedSessionIdFromUrl();
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default behavior of this method is to return
     * {@link HttpServletRequest#authenticate(HttpServletResponse)}
     * on the wrapped request object.
     *
     * @since Servlet 3.0
     */
    @Override
    public boolean authenticate(HttpServletResponse response)
            throws IOException, ServletException {
        return this._getHttpServletRequest().authenticate(response);
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default behavior of this method is to return
     * {@link HttpServletRequest#login(String, String)}
     * on the wrapped request object.
     *
     * @since Servlet 3.0
     */
    @Override
    public void login(String username, String password) throws ServletException {
        this._getHttpServletRequest().login(username, password);
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default behavior of this method is to return
     * {@link HttpServletRequest#logout()}
     * on the wrapped request object.
     *
     * @since Servlet 3.0
     */
    @Override
    public void logout() throws ServletException {
        this._getHttpServletRequest().logout();
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default behavior of this method is to return
     * {@link HttpServletRequest#getParts()}
     * on the wrapped request object.
     *
     * @since Servlet 3.0
     */
    @Override
    public Collection<Part> getParts() throws IOException,
            ServletException {
        return this._getHttpServletRequest().getParts();
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default behavior of this method is to return
     * {@link HttpServletRequest#getPart(String)}
     * on the wrapped request object.
     *
     * @since Servlet 3.0
     */
    @Override
    public Part getPart(String name) throws IOException,
            ServletException {
        return this._getHttpServletRequest().getPart(name);
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default behavior of this method is to return
     * {@link HttpServletRequest#upgrade(Class)} on the wrapped request object.
     *
     * @since Servlet 3.1
     */
    @Override
    public <T extends HttpUpgradeHandler> T upgrade(
            Class<T> httpUpgradeHandlerClass) throws IOException, ServletException {
        return this._getHttpServletRequest().upgrade(httpUpgradeHandlerClass);
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default behavior of this method is to return
     * {@link HttpServletRequest#newPushBuilder()} on the wrapped request
     * object.
     *
     * @since Servlet 4.0
     */
    @Override
    public PushBuilder newPushBuilder() {
        return this._getHttpServletRequest().newPushBuilder();
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default behavior of this method is to return
     * {@link HttpServletRequest#getTrailerFields()} on the wrapped request
     * object.
     *
     * @since Servlet 4.0
     */
    @Override
    public Map<String,String> getTrailerFields() {
        return this._getHttpServletRequest().getTrailerFields();
    }


    /**
     * {@inheritDoc}
     * <p>
     * The default behavior of this method is to return
     * {@link HttpServletRequest#isTrailerFieldsReady()} on the wrapped request
     * object.
     *
     * @since Servlet 4.0
     */
    @Override
    public boolean isTrailerFieldsReady() {
        return this._getHttpServletRequest().isTrailerFieldsReady();
    }
}

```
> 除此之外，网上说的，到底还是不打清晰，可能以后需要自己慢慢的去欣赏，但是现在还是一味的昏昏欲睡，在看源码的时候，总是这样子，因为大部分都是不理解的。而要真的理解的话，本身似乎又是很难的事情。有些时候，是需要通过调试来进行源码的阅读和验证的。
