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

import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;

/**
 * Created by IntelliJ IDEA.
 * User: ryangeyer
 * Date: 12/4/12
 * Time: 3:53 PM
 */
public interface CloudflowTokenTypes {
  final IElementType WHITE_SPACE = TokenType.WHITE_SPACE;

  /////////////////////////////////////////////////////////////////////////////
  // Resources                                                               //
  /////////////////////////////////////////////////////////////////////////////
  final IElementType resCOLLECTION = new CloudflowElementType("resource collection");
  final IElementType resGLOBALCOLLECTION = new CloudflowElementType("global resource collection");
  final IElementType resFIELD = new CloudflowElementType("resource field");

  /////////////////////////////////////////////////////////////////////////////
  // Variables                                                               //
  /////////////////////////////////////////////////////////////////////////////
  final IElementType tVAR = new CloudflowElementType("variable");
  final IElementType tGLOBALVAR = new CloudflowElementType("global var");

  /////////////////////////////////////////////////////////////////////////////
  // Keywords                                                                //
  /////////////////////////////////////////////////////////////////////////////
  final IElementType kMAP = new CloudflowElementType("map");
  final IElementType kCONCURRENT = new CloudflowElementType("concurrent");
  final IElementType kIN = new CloudflowElementType("in");
  final IElementType kRETURN = new CloudflowElementType("return");
  final IElementType kIF = new CloudflowElementType("if");
  final IElementType kELSE = new CloudflowElementType("else");
  final IElementType kELSIF = new CloudflowElementType("elsif");
  final IElementType kEND = new CloudflowElementType("end");
  final IElementType kBEGIN = new CloudflowElementType("begin");
  final IElementType kFOREACH = new CloudflowElementType("foreach");
  final IElementType kWHILE = new CloudflowElementType("while");
  final IElementType kCALL = new CloudflowElementType("call");
  final IElementType kRETRIEVE = new CloudflowElementType("retrieve");
  final IElementType kDEFINE = new CloudflowElementType("define");

  final IElementType tCOMMENT = new CloudflowElementType("comment");
  final IElementType tSTRING = new CloudflowElementType("string");
  final IElementType tSTUB = new CloudflowElementType("nothing");
}
