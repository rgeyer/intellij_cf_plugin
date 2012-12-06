package me.ryangeyer.jetbrains.plugins.lang.cloudflow;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

%%

%class _CloudflowLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{ return;
%eof}

%{
  private IElementType process(IElementType type) {
    if(yystate() != STRING) {
      return type;
    } else {
      return CloudflowTokenTypes.tSTRING;
    }
  }
%}

END_OF_LINE_COMMENT="#"[^\r\n]*
WHITE_SPACE_CHAR=[\ \n\r\t\f]
STRING_CHAR=[^\r\n\"\'\\]*

LITERALS = [a-zA-Z][a-zA-Z0-9_]*

%state STRING

%%

<YYINITIAL> {END_OF_LINE_COMMENT} { yybegin(YYINITIAL); return CloudflowTokenTypes.tCOMMENT; }

<YYINITIAL> \"|\' { yybegin(STRING); return CloudflowTokenTypes.tSTRING; }

<STRING> {
  {STRING_CHAR} { return CloudflowTokenTypes.tSTRING; }
  \"|\' { yybegin(YYINITIAL); return CloudflowTokenTypes.tSTRING; }
}

"map"         { return process(CloudflowTokenTypes.kMAP); }
"concurrent"  { return process(CloudflowTokenTypes.kCONCURRENT); }
"in"          { return process(CloudflowTokenTypes.kIN); }
"return"      { return process(CloudflowTokenTypes.kRETURN); }
"if"          { return process(CloudflowTokenTypes.kIF); }
"else"        { return process(CloudflowTokenTypes.kELSE); }
"elsif"       { return process(CloudflowTokenTypes.kELSIF); }
"end"         { return process(CloudflowTokenTypes.kEND); }
"begin"       { return process(CloudflowTokenTypes.kBEGIN); }
"foreach"     { return process(CloudflowTokenTypes.kFOREACH); }
"while"       { return process(CloudflowTokenTypes.kWHILE); }
"call"        { return process(CloudflowTokenTypes.kCALL); }
"retrieve"    { return process(CloudflowTokenTypes.kRETRIEVE); }
"define"      { return process(CloudflowTokenTypes.kDEFINE); }

@{LITERALS}                             { return process(CloudflowTokenTypes.resCOLLECTION); }
@@{LITERALS}                            { return process(CloudflowTokenTypes.resGLOBALCOLLECTION); }

\${LITERALS}                            { return process(CloudflowTokenTypes.tVAR); }
\$\${LITERALS}                          { return process(CloudflowTokenTypes.tGLOBALVAR); }

{WHITE_SPACE_CHAR}+ { return CloudflowTokenTypes.WHITE_SPACE; }
{LITERALS} { return CloudflowTokenTypes.tSTUB; }
.             { return CloudflowTokenTypes.tSTUB; }