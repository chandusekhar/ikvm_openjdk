package com.sun.tools.jdeps.resources;

public final class jdeps_zh_CN extends java.util.ListResourceBundle {
    protected final Object[][] getContents() {
        return new Object[][] {
            { "artifact.not.found", "\u627E\u4E0D\u5230" },
            { "err.invalid.arg.for.option", "\u9009\u9879\u7684\u53C2\u6570\u65E0\u6548: {0}" },
            { "err.invalid.path", "\u65E0\u6548\u8DEF\u5F84: {0}" },
            { "err.missing.arg", "\u6CA1\u6709\u4E3A{0}\u6307\u5B9A\u503C" },
            { "err.option.after.class", "\u5FC5\u987B\u5728\u7C7B\u4E4B\u524D\u6307\u5B9A\u9009\u9879: {0}" },
            { "err.option.unsupported", "\u4E0D\u652F\u6301{0}: {1}" },
            { "err.profiles.msg", "\u6CA1\u6709\u914D\u7F6E\u6587\u4EF6\u4FE1\u606F" },
            { "err.unknown.option", "\u672A\u77E5\u9009\u9879: {0}" },
            { "error.prefix", "\u9519\u8BEF:" },
            { "jdeps.wiki.url", "https://wiki.openjdk.java.net/display/JDK8/Java+Dependency+Analysis+Tool" },
            { "main.opt.P", "  -P           -profile              \u663E\u793A\u914D\u7F6E\u6587\u4EF6\u6216\u5305\u542B\u7A0B\u5E8F\u5305\u7684\u6587\u4EF6" },
            { "main.opt.R", "  -R           -recursive            \u9012\u5F52\u904D\u5386\u6240\u6709\u88AB\u4F9D\u8D56\u5BF9\u8C61\u3002\n                                     -R \u9009\u9879\u8868\u793A -filter:none\u3002\u5982\u679C\u6307\u5B9A\u4E86 -p, -e, -f\n                                     \u9009\u9879, \u5219\u53EA\u5206\u6790\u5339\u914D\u7684\n                                     \u88AB\u4F9D\u8D56\u5BF9\u8C61\u3002" },
            { "main.opt.apionly", "  -apionly                           \u901A\u8FC7\u516C\u5171\u7C7B (\u5305\u62EC\u5B57\u6BB5\u7C7B\u578B, \u65B9\u6CD5\u53C2\u6570\n                                     \u7C7B\u578B, \u8FD4\u56DE\u7C7B\u578B, \u53D7\u63A7\u5F02\u5E38\u9519\u8BEF\u7C7B\u578B\n                                     \u7B49) \u7684\u516C\u5171\u548C\u53D7\u4FDD\u62A4\u6210\u5458\u7684\u7B7E\u540D\n                                     \u9650\u5236\u5BF9 API (\u5373\u88AB\u4F9D\u8D56\u5BF9\u8C61)\n                                     \u8FDB\u884C\u5206\u6790" },
            { "main.opt.cp", "  -cp <path>   -classpath <path>     \u6307\u5B9A\u67E5\u627E\u7C7B\u6587\u4EF6\u7684\u4F4D\u7F6E" },
            { "main.opt.depth", "  -depth=<depth>                     \u6307\u5B9A\u8FC7\u6E21\u88AB\u4F9D\u8D56\u5BF9\u8C61\u5206\u6790\n                                     \u7684\u6DF1\u5EA6" },
            { "main.opt.dotoutput", "  -dotoutput <dir>                   DOT \u6587\u4EF6\u8F93\u51FA\u7684\u76EE\u6807\u76EE\u5F55" },
            { "main.opt.e", "  -e <regex>   -regex <regex>        \u67E5\u627E\u4E0E\u6307\u5B9A\u6A21\u5F0F\u5339\u914D\u7684\u88AB\u4F9D\u8D56\u5BF9\u8C61\n                                     (-p \u548C -e \u4E92\u76F8\u6392\u65A5)" },
            { "main.opt.f", "  -f <regex>   -filter <regex>       \u7B5B\u9009\u4E0E\u6307\u5B9A\u6A21\u5F0F\u5339\u914D\u7684\u88AB\u4F9D\u8D56\u5BF9\u8C61\n                                     \u5982\u679C\u591A\u6B21\u6307\u5B9A, \u5219\u5C06\u4F7F\u7528\u6700\u540E\u4E00\u4E2A\u88AB\u4F9D\u8D56\u5BF9\u8C61\u3002\n  -filter:package                    \u7B5B\u9009\u4F4D\u4E8E\u540C\u4E00\u7A0B\u5E8F\u5305\u5185\u7684\u88AB\u4F9D\u8D56\u5BF9\u8C61 (\u9ED8\u8BA4)\n  -filter:archive                    \u7B5B\u9009\u4F4D\u4E8E\u540C\u4E00\u6863\u6848\u5185\u7684\u88AB\u4F9D\u8D56\u5BF9\u8C61\n  -filter:none                       \u4E0D\u4F7F\u7528 -filter:package \u548C -filter:archive \u7B5B\u9009\n                                     \u901A\u8FC7 -filter \u9009\u9879\u6307\u5B9A\u7684\u7B5B\u9009\u4ECD\u65E7\u9002\u7528\u3002" },
            { "main.opt.h", "  -h -?        -help                 \u8F93\u51FA\u6B64\u7528\u6CD5\u6D88\u606F" },
            { "main.opt.include", "  -include <regex>                   \u5C06\u5206\u6790\u9650\u5236\u4E3A\u4E0E\u6A21\u5F0F\u5339\u914D\u7684\u7C7B\n                                     \u6B64\u9009\u9879\u7B5B\u9009\u8981\u5206\u6790\u7684\u7C7B\u7684\u5217\u8868\u3002\n                                     \u5B83\u53EF\u4EE5\u4E0E\u5411\u88AB\u4F9D\u8D56\u5BF9\u8C61\u5E94\u7528\u6A21\u5F0F\u7684\n                                     -p \u548C -e \u7ED3\u5408\u4F7F\u7528" },
            { "main.opt.jdkinternals", "  -jdkinternals                      \u5728 JDK \u5185\u90E8 API \u4E0A\u67E5\u627E\u7C7B\u7EA7\u522B\u7684\u88AB\u4F9D\u8D56\u5BF9\u8C61\u3002\n                                     \u9ED8\u8BA4\u60C5\u51B5\u4E0B, \u5B83\u5206\u6790 -classpath \u4E0A\u7684\u6240\u6709\u7C7B\n                                     \u548C\u8F93\u5165\u6587\u4EF6, \u9664\u975E\u6307\u5B9A\u4E86 -include \u9009\u9879\u3002\n                                     \u6B64\u9009\u9879\u4E0D\u80FD\u4E0E -p, -e \u548C -s \u9009\u9879\u4E00\u8D77\u4F7F\u7528\u3002\n                                     \u8B66\u544A: \u5728\u4E0B\u4E00\u4E2A\u53D1\u884C\u7248\u4E2D\u53EF\u80FD\u65E0\u6CD5\u8BBF\u95EE\n                                     JDK \u5185\u90E8 API\u3002" },
            { "main.opt.p", "  -p <pkgname> -package <pkgname>    \u67E5\u627E\u4E0E\u7ED9\u5B9A\u7A0B\u5E8F\u5305\u540D\u79F0\u5339\u914D\u7684\u88AB\u4F9D\u8D56\u5BF9\u8C61\n                                     (\u53EF\u591A\u6B21\u6307\u5B9A)" },
            { "main.opt.s", "  -s           -summary              \u4EC5\u8F93\u51FA\u88AB\u4F9D\u8D56\u5BF9\u8C61\u6982\u8981" },
            { "main.opt.v", "  -v           -verbose              \u8F93\u51FA\u6240\u6709\u7C7B\u7EA7\u522B\u88AB\u4F9D\u8D56\u5BF9\u8C61\n                                     \u7B49\u540C\u4E8E -verbose:class -filter:none\u3002\n  -verbose:package                   \u9ED8\u8BA4\u60C5\u51B5\u4E0B\u8F93\u51FA\u7A0B\u5E8F\u5305\u7EA7\u522B\u88AB\u4F9D\u8D56\u5BF9\u8C61, \n                                     \u4E0D\u5305\u62EC\u540C\u4E00\u7A0B\u5E8F\u5305\u4E2D\u7684\u88AB\u4F9D\u8D56\u5BF9\u8C61\n  -verbose:class                     \u9ED8\u8BA4\u60C5\u51B5\u4E0B\u8F93\u51FA\u7C7B\u7EA7\u522B\u88AB\u4F9D\u8D56\u5BF9\u8C61, \n                                     \u4E0D\u5305\u62EC\u540C\u4E00\u7A0B\u5E8F\u5305\u4E2D\u7684\u88AB\u4F9D\u8D56\u5BF9\u8C61" },
            { "main.opt.version", "  -version                           \u7248\u672C\u4FE1\u606F" },
            { "main.usage", "\u7528\u6CD5: {0} <options> <classes...>\n\u5176\u4E2D <classes> \u53EF\u4EE5\u662F .class \u6587\u4EF6, \u76EE\u5F55, JAR \u6587\u4EF6\u7684\u8DEF\u5F84\u540D,\n\u4E5F\u53EF\u4EE5\u662F\u5168\u9650\u5B9A\u7C7B\u540D\u3002\u53EF\u80FD\u7684\u9009\u9879\u5305\u62EC:" },
            { "main.usage.summary", "\u7528\u6CD5: {0} <options> <classes...>\n\u4F7F\u7528 -h, -? \u6216 -help \u5217\u51FA\u53EF\u80FD\u7684\u9009\u9879" },
            { "warn.invalid.arg", "\u7C7B\u540D\u65E0\u6548\u6216\u8DEF\u5F84\u540D\u4E0D\u5B58\u5728: {0}" },
            { "warn.prefix", "\u8B66\u544A:" },
            { "warn.replace.useJDKInternals", "\u4E0D\u652F\u6301 JDK \u5185\u90E8 API, \u5B83\u4EEC\u4E13\u7528\u4E8E\u901A\u8FC7\u4E0D\u517C\u5BB9\u65B9\u5F0F\u6765\u5220\u9664\n\u6216\u66F4\u6539\u7684 JDK \u5B9E\u73B0, \u53EF\u80FD\u4F1A\u635F\u574F\u60A8\u7684\u5E94\u7528\u7A0B\u5E8F\u3002\n\u8BF7\u4FEE\u6539\u60A8\u7684\u4EE3\u7801, \u6D88\u9664\u4E0E\u4EFB\u4F55 JDK \u5185\u90E8 API \u7684\u76F8\u5173\u6027\u3002\n\u6709\u5173 JDK \u5185\u90E8 API \u66FF\u6362\u7684\u6700\u65B0\u66F4\u65B0, \u8BF7\u67E5\u770B:\n{0}" },
            { "warn.split.package", "\u5DF2\u5728{1} {2}\u4E2D\u5B9A\u4E49\u7A0B\u5E8F\u5305{0}" },
        };
    }
}
