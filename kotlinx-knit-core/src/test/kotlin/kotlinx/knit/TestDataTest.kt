// !!! AUTOMATICALLY GENERATED BY TestDataGen. DO NOT EDIT !!!
package kotlinx.knit

import kotlin.test.Test

class TestDataTest {
    // !!! AUTOMATICALLY GENERATED BY TestDataGen. DO NOT EDIT !!!
    @Test
    fun testCustomProp() {
       verifyTestData(
           "CustomProp",
           "testdata/custom-prop.in.md",
           "testdata/custom-prop.in.md",
           "testdata/custom-prop.properties",
           FileRef.Copy("testdata/custom-prop.copy.knit.template"),
           FileRef.Copy("testdata/custom-prop.copy.test.template"),
           FileRef.Expect("testdata/custom-prop/example-custom-01.kt"),
           FileRef.Expect("testdata/custom-prop/test/CustomPropTest.kt")
       )
    }

    // !!! AUTOMATICALLY GENERATED BY TestDataGen. DO NOT EDIT !!!
    @Test
    fun testDokkaBasic() {
       verifyTestData(
           "DokkaBasic",
           "testdata/dokka-basic.in.md",
           "testdata/dokka-basic.out.md",
           "testdata/dokka-basic.properties"
       )
    }

    // !!! AUTOMATICALLY GENERATED BY TestDataGen. DO NOT EDIT !!!
    @Test
    fun testDokkaHtml() {
       verifyTestData(
           "DokkaHtml",
           "testdata/dokka-html.in.md",
           "testdata/dokka-html.out.md",
           "testdata/dokka-html.properties"
       )
    }

    // !!! AUTOMATICALLY GENERATED BY TestDataGen. DO NOT EDIT !!!
    @Test
    fun testDokkaRefs() {
       verifyTestData(
           "DokkaRefs",
           "testdata/dokka-refs.in.md",
           "testdata/dokka-refs.out.md",
           "testdata/dokka-refs.properties"
       )
    }

    // !!! AUTOMATICALLY GENERATED BY TestDataGen. DO NOT EDIT !!!
    @Test
    fun testDokkaRoot() {
       verifyTestData(
           "DokkaRoot",
           "testdata/dokka-root.in.md",
           "testdata/dokka-root.out.md",
           "testdata/dokka-root.properties"
       )
    }

    // !!! AUTOMATICALLY GENERATED BY TestDataGen. DO NOT EDIT !!!
    @Test
    fun testExampleBasic() {
       verifyTestData(
           "ExampleBasic",
           "testdata/example-basic.in.md",
           "testdata/example-basic.in.md",
           "testdata/example-basic.properties",
           FileRef.Expect("testdata/example-basic/example-basic-01.kt")
       )
    }

    // !!! AUTOMATICALLY GENERATED BY TestDataGen. DO NOT EDIT !!!
    @Test
    fun testExampleInclude() {
       verifyTestData(
           "ExampleInclude",
           "testdata/example-include.in.md",
           "testdata/example-include.in.md",
           "testdata/example-include.properties",
           FileRef.Expect("testdata/example-include/example-include-01.kt")
       )
    }

    // !!! AUTOMATICALLY GENERATED BY TestDataGen. DO NOT EDIT !!!
    @Test
    fun testExampleKdoc() {
       verifyTestData(
           "ExampleKdoc",
           "testdata/example-kdoc.in.kt",
           "testdata/example-kdoc.out.kt",
           "testdata/example-kdoc.properties",
           FileRef.Expect("testdata/example-kdoc/example-kdoc-01.kt")
       )
    }

    // !!! AUTOMATICALLY GENERATED BY TestDataGen. DO NOT EDIT !!!
    @Test
    fun testExampleKnit() {
       verifyTestData(
           "ExampleKnit",
           "testdata/example-knit.in.md",
           "testdata/example-knit.out.md",
           "testdata/example-knit.properties",
           FileRef.Expect("testdata/example-knit/example-knit-01.kt")
       )
    }

    // !!! AUTOMATICALLY GENERATED BY TestDataGen. DO NOT EDIT !!!
    @Test
    fun testExampleMerge() {
       verifyTestData(
           "ExampleMerge",
           "testdata/example-merge.in.md",
           "testdata/example-merge.in.md",
           "testdata/example-merge.properties",
           FileRef.Expect("testdata/example-merge/example-merge-01.kt")
       )
    }

    // !!! AUTOMATICALLY GENERATED BY TestDataGen. DO NOT EDIT !!!
    @Test
    fun testExamplePatternmatch() {
       verifyTestData(
           "ExamplePatternmatch",
           "testdata/example-patternmatch.in.md",
           "testdata/example-patternmatch.in.md",
           "testdata/example-patternmatch.properties",
           FileRef.Expect("testdata/example-patternmatch/example-patternmatch-01.kt"),
           FileRef.Expect("testdata/example-patternmatch/example-patternmatch-02.kt"),
           FileRef.Expect("testdata/example-patternmatch/example-patternmatch-03.kt")
       )
    }

    // !!! AUTOMATICALLY GENERATED BY TestDataGen. DO NOT EDIT !!!
    @Test
    fun testExamplePrefixComment() {
       verifyTestData(
           "ExamplePrefixComment",
           "testdata/example-prefix-comment.in.md",
           "testdata/example-prefix-comment.in.md",
           "testdata/example-prefix-comment.properties",
           FileRef.Expect("testdata/example-prefix-comment/example-prefix-comment-01.kt")
       )
    }

    // !!! AUTOMATICALLY GENERATED BY TestDataGen. DO NOT EDIT !!!
    @Test
    fun testExamplePrefix() {
       verifyTestData(
           "ExamplePrefix",
           "testdata/example-prefix.in.md",
           "testdata/example-prefix.in.md",
           "testdata/example-prefix.properties",
           FileRef.Expect("testdata/example-prefix/example-prefix-01.kt")
       )
    }

    // !!! AUTOMATICALLY GENERATED BY TestDataGen. DO NOT EDIT !!!
    @Test
    fun testExamplePrint() {
       verifyTestData(
           "ExamplePrint",
           "testdata/example-print.in.md",
           "testdata/example-print.in.md",
           "testdata/example-print.properties",
           FileRef.Expect("testdata/example-print/example-print-01.kt")
       )
    }

    // !!! AUTOMATICALLY GENERATED BY TestDataGen. DO NOT EDIT !!!
    @Test
    fun testExampleRenumber() {
       verifyTestData(
           "ExampleRenumber",
           "testdata/example-renumber.in.md",
           "testdata/example-renumber.out.md",
           "testdata/example-renumber.properties",
           FileRef.Expect("testdata/example-renumber/example-renumber-01.kt"),
           FileRef.Expect("testdata/example-renumber/example-renumber-02.kt")
       )
    }

    // !!! AUTOMATICALLY GENERATED BY TestDataGen. DO NOT EDIT !!!
    @Test
    fun testExampleSuffix() {
       verifyTestData(
           "ExampleSuffix",
           "testdata/example-suffix.in.md",
           "testdata/example-suffix.in.md",
           "testdata/example-suffix.properties",
           FileRef.Expect("testdata/example-suffix/example-suffix-01.kt")
       )
    }

    // !!! AUTOMATICALLY GENERATED BY TestDataGen. DO NOT EDIT !!!
    @Test
    fun testExampleToc() {
       verifyTestData(
           "ExampleToc",
           "testdata/example-toc.in.md",
           "testdata/example-toc.out.md",
           null
       )
    }

    // !!! AUTOMATICALLY GENERATED BY TestDataGen. DO NOT EDIT !!!
    @Test
    fun testIncludeProp() {
       verifyTestData(
           "IncludeProp",
           "testdata/include-prop.in.md",
           "testdata/include-prop.in.md",
           "testdata/include-prop.properties",
           FileRef.Copy("testdata/include-prop.copy.template"),
           FileRef.Expect("testdata/include-prop/example-include-01.kt")
       )
    }

    // !!! AUTOMATICALLY GENERATED BY TestDataGen. DO NOT EDIT !!!
    @Test
    fun testPatternProp() {
       verifyTestData(
           "PatternProp",
           "testdata/pattern-prop.in.md",
           "testdata/pattern-prop.out.md",
           "testdata/pattern-prop.properties",
           FileRef.Expect("testdata/pattern-prop/pattern-001.kt")
       )
    }

    // !!! AUTOMATICALLY GENERATED BY TestDataGen. DO NOT EDIT !!!
    @Test
    fun testTestBasic() {
       verifyTestData(
           "TestBasic",
           "testdata/test-basic.in.md",
           "testdata/test-basic.in.md",
           "testdata/test-basic.properties",
           FileRef.Expect("testdata/test-basic/example-basic-01.kt"),
           FileRef.Expect("testdata/test-basic/test/BasicTest.kt")
       )
    }

    // !!! AUTOMATICALLY GENERATED BY TestDataGen. DO NOT EDIT !!!
    @Test
    fun testTestHidden() {
       verifyTestData(
           "TestHidden",
           "testdata/test-hidden.in.md",
           "testdata/test-hidden.in.md",
           "testdata/test-hidden.properties",
           FileRef.Expect("testdata/test-hidden/example-hidden-01.kt"),
           FileRef.Expect("testdata/test-hidden/test/BasicTest.kt")
       )
    }

    // !!! AUTOMATICALLY GENERATED BY TestDataGen. DO NOT EDIT !!!
    @Test
    fun testTestLinesStart() {
       verifyTestData(
           "TestLinesStart",
           "testdata/test-lines-start.in.md",
           "testdata/test-lines-start.in.md",
           "testdata/test-lines-start.properties",
           FileRef.Expect("testdata/test-lines-start/example-lines-start-01.kt"),
           FileRef.Expect("testdata/test-lines-start/test/LinesStartTest.kt")
       )
    }

    // !!! AUTOMATICALLY GENERATED BY TestDataGen. DO NOT EDIT !!!
    @Test
    fun testTestPredicate() {
       verifyTestData(
           "TestPredicate",
           "testdata/test-predicate.in.md",
           "testdata/test-predicate.in.md",
           "testdata/test-predicate.properties",
           FileRef.Expect("testdata/test-predicate/example-predicate-01.kt"),
           FileRef.Expect("testdata/test-predicate/test/PredicateTest.kt")
       )
    }

    // !!! AUTOMATICALLY GENERATED BY TestDataGen. DO NOT EDIT !!!
    @Test
    fun testTocForbiddenSymbols() {
       verifyTestData(
           "TocForbiddenSymbols",
           "testdata/toc-forbidden-symbols.in.md",
           "testdata/toc-forbidden-symbols.out.md",
           null
       )
    }
}
