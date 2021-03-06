/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.formatter;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@RunWith(JUnit3RunnerWithInners.class)
public class TypingIndentationTestBaseGenerated extends AbstractTypingIndentationTestBase {
    @TestMetadata("idea/testData/indentationOnNewline")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class DirectSettings extends AbstractTypingIndentationTestBase {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doNewlineTest, this, testDataFilePath);
        }

        @TestMetadata("AfterCatch.after.kt")
        public void testAfterCatch() throws Exception {
            runTest("idea/testData/indentationOnNewline/AfterCatch.after.kt");
        }

        @TestMetadata("AfterClassNameBeforeFun.after.kt")
        public void testAfterClassNameBeforeFun() throws Exception {
            runTest("idea/testData/indentationOnNewline/AfterClassNameBeforeFun.after.kt");
        }

        @TestMetadata("AfterFinally.after.kt")
        public void testAfterFinally() throws Exception {
            runTest("idea/testData/indentationOnNewline/AfterFinally.after.kt");
        }

        @TestMetadata("AfterImport.after.kt")
        public void testAfterImport() throws Exception {
            runTest("idea/testData/indentationOnNewline/AfterImport.after.kt");
        }

        @TestMetadata("AfterTry.after.kt")
        public void testAfterTry() throws Exception {
            runTest("idea/testData/indentationOnNewline/AfterTry.after.kt");
        }

        public void testAllFilesPresentInDirectSettings() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("idea/testData/indentationOnNewline"), Pattern.compile("^([^\\.]+)\\.after\\.kt.*$"), null, true);
        }

        @TestMetadata("Annotation.after.kt")
        public void testAnnotation() throws Exception {
            runTest("idea/testData/indentationOnNewline/Annotation.after.kt");
        }

        @TestMetadata("AnnotationInDeclaration.after.kt")
        public void testAnnotationInDeclaration() throws Exception {
            runTest("idea/testData/indentationOnNewline/AnnotationInDeclaration.after.kt");
        }

        @TestMetadata("ArgumentListNormalIndent.after.kt")
        public void testArgumentListNormalIndent() throws Exception {
            runTest("idea/testData/indentationOnNewline/ArgumentListNormalIndent.after.kt");
        }

        @TestMetadata("AssignmentAfterEq.after.kt")
        public void testAssignmentAfterEq() throws Exception {
            runTest("idea/testData/indentationOnNewline/AssignmentAfterEq.after.kt");
        }

        @TestMetadata("BinaryWithTypeExpressions.after.kt")
        public void testBinaryWithTypeExpressions() throws Exception {
            runTest("idea/testData/indentationOnNewline/BinaryWithTypeExpressions.after.kt");
        }

        @TestMetadata("ConsecutiveCallsAfterDot.after.kt")
        public void testConsecutiveCallsAfterDot() throws Exception {
            runTest("idea/testData/indentationOnNewline/ConsecutiveCallsAfterDot.after.kt");
        }

        @TestMetadata("ConsecutiveCallsInSaeCallsMiddle.after.kt")
        public void testConsecutiveCallsInSaeCallsMiddle() throws Exception {
            runTest("idea/testData/indentationOnNewline/ConsecutiveCallsInSaeCallsMiddle.after.kt");
        }

        @TestMetadata("ConsecutiveCallsInSafeCallsEnd.after.kt")
        public void testConsecutiveCallsInSafeCallsEnd() throws Exception {
            runTest("idea/testData/indentationOnNewline/ConsecutiveCallsInSafeCallsEnd.after.kt");
        }

        @TestMetadata("DoInFun.after.kt")
        public void testDoInFun() throws Exception {
            runTest("idea/testData/indentationOnNewline/DoInFun.after.kt");
        }

        @TestMetadata("EmptyParameters.after.kt")
        public void testEmptyParameters() throws Exception {
            runTest("idea/testData/indentationOnNewline/EmptyParameters.after.kt");
        }

        @TestMetadata("For.after.kt")
        public void testFor() throws Exception {
            runTest("idea/testData/indentationOnNewline/For.after.kt");
        }

        @TestMetadata("FunctionBlock.after.kt")
        public void testFunctionBlock() throws Exception {
            runTest("idea/testData/indentationOnNewline/FunctionBlock.after.kt");
        }

        @TestMetadata("FunctionWithInference.after.kt")
        public void testFunctionWithInference() throws Exception {
            runTest("idea/testData/indentationOnNewline/FunctionWithInference.after.kt");
        }

        @TestMetadata("If.after.kt")
        public void testIf() throws Exception {
            runTest("idea/testData/indentationOnNewline/If.after.kt");
        }

        @TestMetadata("InBinaryExpressionInMiddle.after.kt")
        public void testInBinaryExpressionInMiddle() throws Exception {
            runTest("idea/testData/indentationOnNewline/InBinaryExpressionInMiddle.after.kt");
        }

        @TestMetadata("InBinaryExpressionUnfinished.after.kt")
        public void testInBinaryExpressionUnfinished() throws Exception {
            runTest("idea/testData/indentationOnNewline/InBinaryExpressionUnfinished.after.kt");
        }

        @TestMetadata("InBinaryExpressionUnfinishedInIf.after.kt")
        public void testInBinaryExpressionUnfinishedInIf() throws Exception {
            runTest("idea/testData/indentationOnNewline/InBinaryExpressionUnfinishedInIf.after.kt");
        }

        @TestMetadata("InBinaryExpressionsBeforeCloseParenthesis.after.kt")
        public void testInBinaryExpressionsBeforeCloseParenthesis() throws Exception {
            runTest("idea/testData/indentationOnNewline/InBinaryExpressionsBeforeCloseParenthesis.after.kt");
        }

        @TestMetadata("InDelegationListAfterColon.after.kt")
        public void testInDelegationListAfterColon() throws Exception {
            runTest("idea/testData/indentationOnNewline/InDelegationListAfterColon.after.kt");
        }

        @TestMetadata("InDelegationListAfterComma.after.kt")
        public void testInDelegationListAfterComma() throws Exception {
            runTest("idea/testData/indentationOnNewline/InDelegationListAfterComma.after.kt");
        }

        @TestMetadata("InDelegationListNotEmpty.after.kt")
        public void testInDelegationListNotEmpty() throws Exception {
            runTest("idea/testData/indentationOnNewline/InDelegationListNotEmpty.after.kt");
        }

        @TestMetadata("InEnumAfterSemicolon.after.kt")
        public void testInEnumAfterSemicolon() throws Exception {
            runTest("idea/testData/indentationOnNewline/InEnumAfterSemicolon.after.kt");
        }

        @TestMetadata("InEnumInitializerListAfterComma.after.kt")
        public void testInEnumInitializerListAfterComma() throws Exception {
            runTest("idea/testData/indentationOnNewline/InEnumInitializerListAfterComma.after.kt");
        }

        @TestMetadata("InEnumInitializerListNotEmpty.after.kt")
        public void testInEnumInitializerListNotEmpty() throws Exception {
            runTest("idea/testData/indentationOnNewline/InEnumInitializerListNotEmpty.after.kt");
        }

        @TestMetadata("InExpressionsParentheses.after.kt")
        public void testInExpressionsParentheses() throws Exception {
            runTest("idea/testData/indentationOnNewline/InExpressionsParentheses.after.kt");
        }

        @TestMetadata("InExpressionsParenthesesBeforeOperand.after.kt")
        public void testInExpressionsParenthesesBeforeOperand() throws Exception {
            runTest("idea/testData/indentationOnNewline/InExpressionsParenthesesBeforeOperand.after.kt");
        }

        @TestMetadata("InLabmdaAfterArrow.after.kt")
        public void testInLabmdaAfterArrow() throws Exception {
            runTest("idea/testData/indentationOnNewline/InLabmdaAfterArrow.after.kt");
        }

        @TestMetadata("InLambdaAfterArrowWithSpaces.after.kt")
        public void testInLambdaAfterArrowWithSpaces() throws Exception {
            runTest("idea/testData/indentationOnNewline/InLambdaAfterArrowWithSpaces.after.kt");
        }

        @TestMetadata("InLambdaBeforeParams.after.kt")
        public void testInLambdaBeforeParams() throws Exception {
            runTest("idea/testData/indentationOnNewline/InLambdaBeforeParams.after.kt");
        }

        @TestMetadata("InLambdaInsideChainCallSameLine.after.kt")
        public void testInLambdaInsideChainCallSameLine() throws Exception {
            runTest("idea/testData/indentationOnNewline/InLambdaInsideChainCallSameLine.after.kt");
        }

        @TestMetadata("InLambdaInsideChainCallSameLineWithSpaces.after.kt")
        public void testInLambdaInsideChainCallSameLineWithSpaces() throws Exception {
            runTest("idea/testData/indentationOnNewline/InLambdaInsideChainCallSameLineWithSpaces.after.kt");
        }

        @TestMetadata("InLambdaInsideChainCallWithNewLine.after.kt")
        public void testInLambdaInsideChainCallWithNewLine() throws Exception {
            runTest("idea/testData/indentationOnNewline/InLambdaInsideChainCallWithNewLine.after.kt");
        }

        @TestMetadata("InLambdaInsideChainCallWithNewLineWithSpaces.after.kt")
        public void testInLambdaInsideChainCallWithNewLineWithSpaces() throws Exception {
            runTest("idea/testData/indentationOnNewline/InLambdaInsideChainCallWithNewLineWithSpaces.after.kt");
        }

        @TestMetadata("InMultilineLambdaAfterArrow.after.kt")
        public void testInMultilineLambdaAfterArrow() throws Exception {
            runTest("idea/testData/indentationOnNewline/InMultilineLambdaAfterArrow.after.kt");
        }

        @TestMetadata("IsExpressionAfterIs.after.kt")
        public void testIsExpressionAfterIs() throws Exception {
            runTest("idea/testData/indentationOnNewline/IsExpressionAfterIs.after.kt");
        }

        @TestMetadata("KT20783.after.kt")
        public void testKT20783() throws Exception {
            runTest("idea/testData/indentationOnNewline/KT20783.after.kt");
        }

        @TestMetadata("ModifierListInUnfinishedDeclaration.after.kt")
        public void testModifierListInUnfinishedDeclaration() throws Exception {
            runTest("idea/testData/indentationOnNewline/ModifierListInUnfinishedDeclaration.after.kt");
        }

        @TestMetadata("MultideclarationAfterEq.after.kt")
        public void testMultideclarationAfterEq() throws Exception {
            runTest("idea/testData/indentationOnNewline/MultideclarationAfterEq.after.kt");
        }

        @TestMetadata("MultideclarationBeforeEq.after.kt")
        public void testMultideclarationBeforeEq() throws Exception {
            runTest("idea/testData/indentationOnNewline/MultideclarationBeforeEq.after.kt");
        }

        @TestMetadata("NotFirstParameter.after.kt")
        public void testNotFirstParameter() throws Exception {
            runTest("idea/testData/indentationOnNewline/NotFirstParameter.after.kt");
        }

        @TestMetadata("PropertyWithInference.after.kt")
        public void testPropertyWithInference() throws Exception {
            runTest("idea/testData/indentationOnNewline/PropertyWithInference.after.kt");
        }

        @TestMetadata("ReturnContinue.after.kt")
        public void testReturnContinue() throws Exception {
            runTest("idea/testData/indentationOnNewline/ReturnContinue.after.kt");
        }

        @TestMetadata("SettingAlignMultilineParametersInCalls.after.kt")
        public void testSettingAlignMultilineParametersInCalls() throws Exception {
            runTest("idea/testData/indentationOnNewline/SettingAlignMultilineParametersInCalls.after.kt");
        }

        @TestMetadata("While.after.kt")
        public void testWhile() throws Exception {
            runTest("idea/testData/indentationOnNewline/While.after.kt");
        }

        @TestMetadata("idea/testData/indentationOnNewline/script")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class Script extends AbstractTypingIndentationTestBase {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doNewlineTest, this, testDataFilePath);
            }

            public void testAllFilesPresentInScript() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("idea/testData/indentationOnNewline/script"), Pattern.compile("^([^\\.]+)\\.after\\.kt.*$"), null, true);
            }

            @TestMetadata("ScriptAfterClosingBrace.after.kts")
            public void testScriptAfterClosingBrace() throws Exception {
                runTest("idea/testData/indentationOnNewline/script/ScriptAfterClosingBrace.after.kts");
            }

            @TestMetadata("ScriptAfterExpression.after.kts")
            public void testScriptAfterExpression() throws Exception {
                runTest("idea/testData/indentationOnNewline/script/ScriptAfterExpression.after.kts");
            }

            @TestMetadata("ScriptAfterFun.after.kts")
            public void testScriptAfterFun() throws Exception {
                runTest("idea/testData/indentationOnNewline/script/ScriptAfterFun.after.kts");
            }

            @TestMetadata("ScriptAfterImport.after.kts")
            public void testScriptAfterImport() throws Exception {
                runTest("idea/testData/indentationOnNewline/script/ScriptAfterImport.after.kts");
            }

            @TestMetadata("ScriptBetweenFunctionCalls.after.kts")
            public void testScriptBetweenFunctionCalls() throws Exception {
                runTest("idea/testData/indentationOnNewline/script/ScriptBetweenFunctionCalls.after.kts");
            }

            @TestMetadata("ScriptInsideFun.after.kts")
            public void testScriptInsideFun() throws Exception {
                runTest("idea/testData/indentationOnNewline/script/ScriptInsideFun.after.kts");
            }
        }
    }

    @TestMetadata("idea/testData/indentationOnNewline")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class InvertedSettings extends AbstractTypingIndentationTestBase {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doNewlineTestWithInvert, this, testDataFilePath);
        }

        public void testAllFilesPresentInInvertedSettings() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("idea/testData/indentationOnNewline"), Pattern.compile("^([^\\.]+)\\.after\\.inv\\.kt.*$"), null, true);
        }

        @TestMetadata("AssignmentAfterEq.after.inv.kt")
        public void testAssignmentAfterEq() throws Exception {
            runTest("idea/testData/indentationOnNewline/AssignmentAfterEq.after.inv.kt");
        }

        @TestMetadata("BinaryWithTypeExpressions.after.inv.kt")
        public void testBinaryWithTypeExpressions() throws Exception {
            runTest("idea/testData/indentationOnNewline/BinaryWithTypeExpressions.after.inv.kt");
        }

        @TestMetadata("InBinaryExpressionInMiddle.after.inv.kt")
        public void testInBinaryExpressionInMiddle() throws Exception {
            runTest("idea/testData/indentationOnNewline/InBinaryExpressionInMiddle.after.inv.kt");
        }

        @TestMetadata("InBinaryExpressionUnfinished.after.inv.kt")
        public void testInBinaryExpressionUnfinished() throws Exception {
            runTest("idea/testData/indentationOnNewline/InBinaryExpressionUnfinished.after.inv.kt");
        }

        @TestMetadata("InBinaryExpressionUnfinishedInIf.after.inv.kt")
        public void testInBinaryExpressionUnfinishedInIf() throws Exception {
            runTest("idea/testData/indentationOnNewline/InBinaryExpressionUnfinishedInIf.after.inv.kt");
        }

        @TestMetadata("InBinaryExpressionsBeforeCloseParenthesis.after.inv.kt")
        public void testInBinaryExpressionsBeforeCloseParenthesis() throws Exception {
            runTest("idea/testData/indentationOnNewline/InBinaryExpressionsBeforeCloseParenthesis.after.inv.kt");
        }

        @TestMetadata("InDelegationListAfterColon.after.inv.kt")
        public void testInDelegationListAfterColon() throws Exception {
            runTest("idea/testData/indentationOnNewline/InDelegationListAfterColon.after.inv.kt");
        }

        @TestMetadata("InDelegationListAfterComma.after.inv.kt")
        public void testInDelegationListAfterComma() throws Exception {
            runTest("idea/testData/indentationOnNewline/InDelegationListAfterComma.after.inv.kt");
        }

        @TestMetadata("InDelegationListNotEmpty.after.inv.kt")
        public void testInDelegationListNotEmpty() throws Exception {
            runTest("idea/testData/indentationOnNewline/InDelegationListNotEmpty.after.inv.kt");
        }

        @TestMetadata("InEnumAfterSemicolon.after.inv.kt")
        public void testInEnumAfterSemicolon() throws Exception {
            runTest("idea/testData/indentationOnNewline/InEnumAfterSemicolon.after.inv.kt");
        }

        @TestMetadata("InEnumInitializerListAfterComma.after.inv.kt")
        public void testInEnumInitializerListAfterComma() throws Exception {
            runTest("idea/testData/indentationOnNewline/InEnumInitializerListAfterComma.after.inv.kt");
        }

        @TestMetadata("InEnumInitializerListNotEmpty.after.inv.kt")
        public void testInEnumInitializerListNotEmpty() throws Exception {
            runTest("idea/testData/indentationOnNewline/InEnumInitializerListNotEmpty.after.inv.kt");
        }

        @TestMetadata("InExpressionsParentheses.after.inv.kt")
        public void testInExpressionsParentheses() throws Exception {
            runTest("idea/testData/indentationOnNewline/InExpressionsParentheses.after.inv.kt");
        }

        @TestMetadata("InExpressionsParenthesesBeforeOperand.after.inv.kt")
        public void testInExpressionsParenthesesBeforeOperand() throws Exception {
            runTest("idea/testData/indentationOnNewline/InExpressionsParenthesesBeforeOperand.after.inv.kt");
        }

        @TestMetadata("IsExpressionAfterIs.after.inv.kt")
        public void testIsExpressionAfterIs() throws Exception {
            runTest("idea/testData/indentationOnNewline/IsExpressionAfterIs.after.inv.kt");
        }

        @TestMetadata("SettingAlignMultilineParametersInCalls.after.inv.kt")
        public void testSettingAlignMultilineParametersInCalls() throws Exception {
            runTest("idea/testData/indentationOnNewline/SettingAlignMultilineParametersInCalls.after.inv.kt");
        }

        @TestMetadata("idea/testData/indentationOnNewline/script")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class Script extends AbstractTypingIndentationTestBase {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doNewlineTestWithInvert, this, testDataFilePath);
            }

            public void testAllFilesPresentInScript() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("idea/testData/indentationOnNewline/script"), Pattern.compile("^([^\\.]+)\\.after\\.inv\\.kt.*$"), null, true);
            }
        }
    }
}
