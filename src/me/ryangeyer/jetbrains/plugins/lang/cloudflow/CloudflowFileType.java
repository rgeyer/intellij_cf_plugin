/*
 * Copyright (c) 2012 Ryan J. Geyer
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package me.ryangeyer.jetbrains.plugins.lang.cloudflow;

import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.IconLoader;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/**
 * Created by IntelliJ IDEA.
 * User: ryangeyer
 * Date: 12/4/12
 * Time: 11:34 AM
 */
public class CloudflowFileType extends LanguageFileType {

  public static final CloudflowFileType CLOUDFLOW_FILE_TYPE = new CloudflowFileType();
  public static final Language CLOUDFLOW_LANGUAGE = CLOUDFLOW_FILE_TYPE.getLanguage();
  @NonNls public static final String DEFAULT_EXTENSION = "def";
  @NonNls public static final String DOT_DEFAULT_EXTENSION = "."+DEFAULT_EXTENSION;

  private CloudflowFileType() {
    super(new CloudflowLanguage());
  }

  @NotNull
  @NonNls
  public String getName() {
    return "CloudFlow";
  }

  @NotNull
  public String getDescription() {
    return "CloudFlow definition files";
  }

  @NotNull
  @NonNls
  public String getDefaultExtension() {
    return DEFAULT_EXTENSION;
  }

  public Icon getIcon() {
    return IconLoader.getIcon("/me/ryangeyer/jetbrains/plugins/lang/cloudflow/rs.png");
  }
}
