/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.fir;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/fir/analysis-tests/testData/resolveWithStdlib")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class FirDiagnosticsWithStdlibTestGenerated extends AbstractFirDiagnosticsWithStdlibTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    @TestMetadata("addAllOnJavaCollection.kt")
    public void testAddAllOnJavaCollection() throws Exception {
        runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/addAllOnJavaCollection.kt");
    }

    public void testAllFilesPresentInResolveWithStdlib() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/fir/analysis-tests/testData/resolveWithStdlib"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
    }

    @TestMetadata("arrayFilterCapturedType.kt")
    public void testArrayFilterCapturedType() throws Exception {
        runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/arrayFilterCapturedType.kt");
    }

    @TestMetadata("arrayFirstOrNull.kt")
    public void testArrayFirstOrNull() throws Exception {
        runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/arrayFirstOrNull.kt");
    }

    @TestMetadata("arrayInLocal.kt")
    public void testArrayInLocal() throws Exception {
        runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/arrayInLocal.kt");
    }

    @TestMetadata("backingField.kt")
    public void testBackingField() throws Exception {
        runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/backingField.kt");
    }

    @TestMetadata("classLiteralForParameter.kt")
    public void testClassLiteralForParameter() throws Exception {
        runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/classLiteralForParameter.kt");
    }

    @TestMetadata("cloneArray.kt")
    public void testCloneArray() throws Exception {
        runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/cloneArray.kt");
    }

    @TestMetadata("companionLoad.kt")
    public void testCompanionLoad() throws Exception {
        runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/companionLoad.kt");
    }

    @TestMetadata("components.kt")
    public void testComponents() throws Exception {
        runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/components.kt");
    }

    @TestMetadata("concurrent.kt")
    public void testConcurrent() throws Exception {
        runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/concurrent.kt");
    }

    @TestMetadata("concurrentMapOfAliases.kt")
    public void testConcurrentMapOfAliases() throws Exception {
        runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/concurrentMapOfAliases.kt");
    }

    @TestMetadata("emptyArray.kt")
    public void testEmptyArray() throws Exception {
        runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/emptyArray.kt");
    }

    @TestMetadata("enumValuesDeserialized.kt")
    public void testEnumValuesDeserialized() throws Exception {
        runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/enumValuesDeserialized.kt");
    }

    @TestMetadata("exception.kt")
    public void testException() throws Exception {
        runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/exception.kt");
    }

    @TestMetadata("factoryFunctionOverloads.kt")
    public void testFactoryFunctionOverloads() throws Exception {
        runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/factoryFunctionOverloads.kt");
    }

    @TestMetadata("functionAndFunctionN.kt")
    public void testFunctionAndFunctionN() throws Exception {
        runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/functionAndFunctionN.kt");
    }

    @TestMetadata("functionX.kt")
    public void testFunctionX() throws Exception {
        runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/functionX.kt");
    }

    @TestMetadata("getOnKProperty.kt")
    public void testGetOnKProperty() throws Exception {
        runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/getOnKProperty.kt");
    }

    @TestMetadata("hashMapTypeAlias.kt")
    public void testHashMapTypeAlias() throws Exception {
        runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/hashMapTypeAlias.kt");
    }

    @TestMetadata("hashSet.kt")
    public void testHashSet() throws Exception {
        runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/hashSet.kt");
    }

    @TestMetadata("hashTableWithForEach.kt")
    public void testHashTableWithForEach() throws Exception {
        runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/hashTableWithForEach.kt");
    }

    @TestMetadata("helloWorld.kt")
    public void testHelloWorld() throws Exception {
        runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/helloWorld.kt");
    }

    @TestMetadata("implicitReceiverOrder.kt")
    public void testImplicitReceiverOrder() throws Exception {
        runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/implicitReceiverOrder.kt");
    }

    @TestMetadata("inapplicableRemoveAll.kt")
    public void testInapplicableRemoveAll() throws Exception {
        runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/inapplicableRemoveAll.kt");
    }

    @TestMetadata("javaEnumSynthetic.kt")
    public void testJavaEnumSynthetic() throws Exception {
        runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/javaEnumSynthetic.kt");
    }

    @TestMetadata("javaLangComparator.kt")
    public void testJavaLangComparator() throws Exception {
        runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/javaLangComparator.kt");
    }

    @TestMetadata("kotlinComparatorAlias.kt")
    public void testKotlinComparatorAlias() throws Exception {
        runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/kotlinComparatorAlias.kt");
    }

    @TestMetadata("listPlusAssign.kt")
    public void testListPlusAssign() throws Exception {
        runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/listPlusAssign.kt");
    }

    @TestMetadata("lowPriorityInResolution.kt")
    public void testLowPriorityInResolution() throws Exception {
        runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/lowPriorityInResolution.kt");
    }

    @TestMetadata("mapList.kt")
    public void testMapList() throws Exception {
        runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/mapList.kt");
    }

    @TestMetadata("multipleImplicitReceivers.kt")
    public void testMultipleImplicitReceivers() throws Exception {
        runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/multipleImplicitReceivers.kt");
    }

    @TestMetadata("noneWithForEach.kt")
    public void testNoneWithForEach() throws Exception {
        runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/noneWithForEach.kt");
    }

    @TestMetadata("nullableTypeParameter.kt")
    public void testNullableTypeParameter() throws Exception {
        runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/nullableTypeParameter.kt");
    }

    @TestMetadata("problems.kt")
    public void testProblems() throws Exception {
        runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/problems.kt");
    }

    @TestMetadata("rangeTo.kt")
    public void testRangeTo() throws Exception {
        runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/rangeTo.kt");
    }

    @TestMetadata("recursiveBug.kt")
    public void testRecursiveBug() throws Exception {
        runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/recursiveBug.kt");
    }

    @TestMetadata("reflectionClass.kt")
    public void testReflectionClass() throws Exception {
        runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/reflectionClass.kt");
    }

    @TestMetadata("removeIf.kt")
    public void testRemoveIf() throws Exception {
        runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/removeIf.kt");
    }

    @TestMetadata("removeOnAbstractMap.kt")
    public void testRemoveOnAbstractMap() throws Exception {
        runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/removeOnAbstractMap.kt");
    }

    @TestMetadata("runOnIntegerLiteral.kt")
    public void testRunOnIntegerLiteral() throws Exception {
        runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/runOnIntegerLiteral.kt");
    }

    @TestMetadata("simpleLazy.kt")
    public void testSimpleLazy() throws Exception {
        runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/simpleLazy.kt");
    }

    @TestMetadata("toSortedMapWithComparator.kt")
    public void testToSortedMapWithComparator() throws Exception {
        runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/toSortedMapWithComparator.kt");
    }

    @TestMetadata("topLevelResolve.kt")
    public void testTopLevelResolve() throws Exception {
        runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/topLevelResolve.kt");
    }

    @TestMetadata("typeAliasDeserialization.kt")
    public void testTypeAliasDeserialization() throws Exception {
        runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/typeAliasDeserialization.kt");
    }

    @TestMetadata("typeAliasWithForEach.kt")
    public void testTypeAliasWithForEach() throws Exception {
        runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/typeAliasWithForEach.kt");
    }

    @TestMetadata("typeParameterDerived.kt")
    public void testTypeParameterDerived() throws Exception {
        runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/typeParameterDerived.kt");
    }

    @TestMetadata("unaryOperators.kt")
    public void testUnaryOperators() throws Exception {
        runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/unaryOperators.kt");
    }

    @TestMetadata("whenAsLambdaReturnStatement.kt")
    public void testWhenAsLambdaReturnStatement() throws Exception {
        runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/whenAsLambdaReturnStatement.kt");
    }

    @TestMetadata("withInInitializer.kt")
    public void testWithInInitializer() throws Exception {
        runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/withInInitializer.kt");
    }

    @TestMetadata("compiler/fir/analysis-tests/testData/resolveWithStdlib/callableReferences")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class CallableReferences extends AbstractFirDiagnosticsWithStdlibTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInCallableReferences() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/fir/analysis-tests/testData/resolveWithStdlib/callableReferences"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
        }

        @TestMetadata("beyoundCalls.kt")
        public void testBeyoundCalls() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/callableReferences/beyoundCalls.kt");
        }

        @TestMetadata("companions.kt")
        public void testCompanions() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/callableReferences/companions.kt");
        }

        @TestMetadata("constructors.kt")
        public void testConstructors() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/callableReferences/constructors.kt");
        }

        @TestMetadata("differentLevels.kt")
        public void testDifferentLevels() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/callableReferences/differentLevels.kt");
        }

        @TestMetadata("extensionReceiverInference.kt")
        public void testExtensionReceiverInference() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/callableReferences/extensionReceiverInference.kt");
        }

        @TestMetadata("ifWithCR.kt")
        public void testIfWithCR() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/callableReferences/ifWithCR.kt");
        }

        @TestMetadata("implicitTypes.kt")
        public void testImplicitTypes() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/callableReferences/implicitTypes.kt");
        }

        @TestMetadata("inferenceFromCallableReferenceType.kt")
        public void testInferenceFromCallableReferenceType() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/callableReferences/inferenceFromCallableReferenceType.kt");
        }

        @TestMetadata("inferenceFromExpectedType.kt")
        public void testInferenceFromExpectedType() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/callableReferences/inferenceFromExpectedType.kt");
        }

        @TestMetadata("javaStatic.kt")
        public void testJavaStatic() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/callableReferences/javaStatic.kt");
        }

        @TestMetadata("manyCandidatesInference.kt")
        public void testManyCandidatesInference() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/callableReferences/manyCandidatesInference.kt");
        }

        @TestMetadata("manyInnerCandidates.kt")
        public void testManyInnerCandidates() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/callableReferences/manyInnerCandidates.kt");
        }

        @TestMetadata("manyInnerManyOuterCandidates.kt")
        public void testManyInnerManyOuterCandidates() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/callableReferences/manyInnerManyOuterCandidates.kt");
        }

        @TestMetadata("manyInnermanyOuterCandidatesAmbiguity.kt")
        public void testManyInnermanyOuterCandidatesAmbiguity() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/callableReferences/manyInnermanyOuterCandidatesAmbiguity.kt");
        }

        @TestMetadata("manyOuterCandidates.kt")
        public void testManyOuterCandidates() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/callableReferences/manyOuterCandidates.kt");
        }

        @TestMetadata("properties.kt")
        public void testProperties() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/callableReferences/properties.kt");
        }

        @TestMetadata("sam.kt")
        public void testSam() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/callableReferences/sam.kt");
        }

        @TestMetadata("simpleClassReceiver.kt")
        public void testSimpleClassReceiver() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/callableReferences/simpleClassReceiver.kt");
        }

        @TestMetadata("simpleExpressionReceiver.kt")
        public void testSimpleExpressionReceiver() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/callableReferences/simpleExpressionReceiver.kt");
        }

        @TestMetadata("simpleNoReceiver.kt")
        public void testSimpleNoReceiver() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/callableReferences/simpleNoReceiver.kt");
        }

        @TestMetadata("varProperties.kt")
        public void testVarProperties() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/callableReferences/varProperties.kt");
        }

        @TestMetadata("compiler/fir/analysis-tests/testData/resolveWithStdlib/callableReferences/fromBasicDiagnosticTests")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class FromBasicDiagnosticTests extends AbstractFirDiagnosticsWithStdlibTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
            }

            public void testAllFilesPresentInFromBasicDiagnosticTests() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/fir/analysis-tests/testData/resolveWithStdlib/callableReferences/fromBasicDiagnosticTests"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
            }

            @TestMetadata("ambiguityWhenNoApplicableCallableReferenceCandidate.kt")
            public void testAmbiguityWhenNoApplicableCallableReferenceCandidate() throws Exception {
                runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/callableReferences/fromBasicDiagnosticTests/ambiguityWhenNoApplicableCallableReferenceCandidate.kt");
            }

            @TestMetadata("applicableCallableReferenceFromDistantScope.kt")
            public void testApplicableCallableReferenceFromDistantScope() throws Exception {
                runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/callableReferences/fromBasicDiagnosticTests/applicableCallableReferenceFromDistantScope.kt");
            }

            @TestMetadata("chooseCallableReferenceDependingOnInferredReceiver.kt")
            public void testChooseCallableReferenceDependingOnInferredReceiver() throws Exception {
                runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/callableReferences/fromBasicDiagnosticTests/chooseCallableReferenceDependingOnInferredReceiver.kt");
            }

            @TestMetadata("commonSupertypeFromReturnTypesOfCallableReference.kt")
            public void testCommonSupertypeFromReturnTypesOfCallableReference() throws Exception {
                runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/callableReferences/fromBasicDiagnosticTests/commonSupertypeFromReturnTypesOfCallableReference.kt");
            }

            @TestMetadata("eagerAndPostponedCallableReferences.kt")
            public void testEagerAndPostponedCallableReferences() throws Exception {
                runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/callableReferences/fromBasicDiagnosticTests/eagerAndPostponedCallableReferences.kt");
            }

            @TestMetadata("eagerResolveOfSingleCallableReference.kt")
            public void testEagerResolveOfSingleCallableReference() throws Exception {
                runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/callableReferences/fromBasicDiagnosticTests/eagerResolveOfSingleCallableReference.kt");
            }

            @TestMetadata("moreSpecificAmbiguousExtensions.kt")
            public void testMoreSpecificAmbiguousExtensions() throws Exception {
                runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/callableReferences/fromBasicDiagnosticTests/moreSpecificAmbiguousExtensions.kt");
            }

            @TestMetadata("multipleOutersAndMultipleCallableReferences.kt")
            public void testMultipleOutersAndMultipleCallableReferences() throws Exception {
                runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/callableReferences/fromBasicDiagnosticTests/multipleOutersAndMultipleCallableReferences.kt");
            }

            @TestMetadata("noAmbiguityBetweenTopLevelAndMemberProperty.kt")
            public void testNoAmbiguityBetweenTopLevelAndMemberProperty() throws Exception {
                runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/callableReferences/fromBasicDiagnosticTests/noAmbiguityBetweenTopLevelAndMemberProperty.kt");
            }

            @TestMetadata("overloadsBound.kt")
            public void testOverloadsBound() throws Exception {
                runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/callableReferences/fromBasicDiagnosticTests/overloadsBound.kt");
            }

            @TestMetadata("postponedResolveOfManyCallableReference.kt")
            public void testPostponedResolveOfManyCallableReference() throws Exception {
                runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/callableReferences/fromBasicDiagnosticTests/postponedResolveOfManyCallableReference.kt");
            }

            @TestMetadata("resolveCallableReferencesAfterAllSimpleArguments.kt")
            public void testResolveCallableReferencesAfterAllSimpleArguments() throws Exception {
                runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/callableReferences/fromBasicDiagnosticTests/resolveCallableReferencesAfterAllSimpleArguments.kt");
            }

            @TestMetadata("withGenericFun.kt")
            public void testWithGenericFun() throws Exception {
                runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/callableReferences/fromBasicDiagnosticTests/withGenericFun.kt");
            }
        }
    }

    @TestMetadata("compiler/fir/analysis-tests/testData/resolveWithStdlib/contracts")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Contracts extends AbstractFirDiagnosticsWithStdlibTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInContracts() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/fir/analysis-tests/testData/resolveWithStdlib/contracts"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
        }

        @TestMetadata("callsInPlace.kt")
        public void testCallsInPlace() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/contracts/callsInPlace.kt");
        }

        @TestMetadata("conditionalEffects.kt")
        public void testConditionalEffects() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/contracts/conditionalEffects.kt");
        }

        @TestMetadata("notIsNullOrEmpty.kt")
        public void testNotIsNullOrEmpty() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/contracts/notIsNullOrEmpty.kt");
        }
    }

    @TestMetadata("compiler/fir/analysis-tests/testData/resolveWithStdlib/delegates")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Delegates extends AbstractFirDiagnosticsWithStdlibTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInDelegates() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/fir/analysis-tests/testData/resolveWithStdlib/delegates"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
        }

        @TestMetadata("anonymousInDelegate.kt")
        public void testAnonymousInDelegate() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/delegates/anonymousInDelegate.kt");
        }

        @TestMetadata("delegateTypeMismatch.kt")
        public void testDelegateTypeMismatch() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/delegates/delegateTypeMismatch.kt");
        }

        @TestMetadata("delegateWithAnonymousObject.kt")
        public void testDelegateWithAnonymousObject() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/delegates/delegateWithAnonymousObject.kt");
        }

        @TestMetadata("propertyWithFunctionalType.kt")
        public void testPropertyWithFunctionalType() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/delegates/propertyWithFunctionalType.kt");
        }

        @TestMetadata("simpleDelegateProvider.kt")
        public void testSimpleDelegateProvider() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/delegates/simpleDelegateProvider.kt");
        }

        @TestMetadata("simpleDelegatedToMap.kt")
        public void testSimpleDelegatedToMap() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/delegates/simpleDelegatedToMap.kt");
        }
    }

    @TestMetadata("compiler/fir/analysis-tests/testData/resolveWithStdlib/inference")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Inference extends AbstractFirDiagnosticsWithStdlibTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInInference() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/fir/analysis-tests/testData/resolveWithStdlib/inference"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
        }

        @TestMetadata("complexConstraintSystem.kt")
        public void testComplexConstraintSystem() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/inference/complexConstraintSystem.kt");
        }
    }

    @TestMetadata("compiler/fir/analysis-tests/testData/resolveWithStdlib/j+k")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class J_k extends AbstractFirDiagnosticsWithStdlibTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInJ_k() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/fir/analysis-tests/testData/resolveWithStdlib/j+k"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
        }

        @TestMetadata("capturedFlexible.kt")
        public void testCapturedFlexible() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/j+k/capturedFlexible.kt");
        }

        @TestMetadata("complexFlexibleInference.kt")
        public void testComplexFlexibleInference() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/j+k/complexFlexibleInference.kt");
        }

        @TestMetadata("FieldAndGetter.kt")
        public void testFieldAndGetter() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/j+k/FieldAndGetter.kt");
        }

        @TestMetadata("fieldOverride.kt")
        public void testFieldOverride() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/j+k/fieldOverride.kt");
        }

        @TestMetadata("FieldSubstitution.kt")
        public void testFieldSubstitution() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/j+k/FieldSubstitution.kt");
        }

        @TestMetadata("flexibleTypeAliases.kt")
        public void testFlexibleTypeAliases() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/j+k/flexibleTypeAliases.kt");
        }

        @TestMetadata("FunctionTypeInJava.kt")
        public void testFunctionTypeInJava() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/j+k/FunctionTypeInJava.kt");
        }

        @TestMetadata("JavaVisibility2.kt")
        public void testJavaVisibility2() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/j+k/JavaVisibility2.kt");
        }

        @TestMetadata("KJKComplexHierarchy.kt")
        public void testKJKComplexHierarchy() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/j+k/KJKComplexHierarchy.kt");
        }

        @TestMetadata("KJKComplexHierarchyWithNested.kt")
        public void testKJKComplexHierarchyWithNested() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/j+k/KJKComplexHierarchyWithNested.kt");
        }

        @TestMetadata("KJKInheritance.kt")
        public void testKJKInheritance() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/j+k/KJKInheritance.kt");
        }

        @TestMetadata("KJKInheritanceGeneric.kt")
        public void testKJKInheritanceGeneric() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/j+k/KJKInheritanceGeneric.kt");
        }

        @TestMetadata("KotlinClassParameter.kt")
        public void testKotlinClassParameter() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/j+k/KotlinClassParameter.kt");
        }

        @TestMetadata("KotlinClassParameterGeneric.kt")
        public void testKotlinClassParameterGeneric() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/j+k/KotlinClassParameterGeneric.kt");
        }

        @TestMetadata("LoggerInstance.kt")
        public void testLoggerInstance() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/j+k/LoggerInstance.kt");
        }

        @TestMetadata("MapCompute.kt")
        public void testMapCompute() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/j+k/MapCompute.kt");
        }

        @TestMetadata("MapEntry.kt")
        public void testMapEntry() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/j+k/MapEntry.kt");
        }

        @TestMetadata("mapMerge.kt")
        public void testMapMerge() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/j+k/mapMerge.kt");
        }

        @TestMetadata("MyException.kt")
        public void testMyException() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/j+k/MyException.kt");
        }

        @TestMetadata("MyIterable.kt")
        public void testMyIterable() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/j+k/MyIterable.kt");
        }

        @TestMetadata("MyMap.kt")
        public void testMyMap() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/j+k/MyMap.kt");
        }

        @TestMetadata("outerInnerClasses.kt")
        public void testOuterInnerClasses() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/j+k/outerInnerClasses.kt");
        }

        @TestMetadata("RawType.kt")
        public void testRawType() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/j+k/RawType.kt");
        }

        @TestMetadata("smartSet.kt")
        public void testSmartSet() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/j+k/smartSet.kt");
        }

        @TestMetadata("StaticClassConstructorFromBaseClass.kt")
        public void testStaticClassConstructorFromBaseClass() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/j+k/StaticClassConstructorFromBaseClass.kt");
        }

        @TestMetadata("StaticFromBaseClass.kt")
        public void testStaticFromBaseClass() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/j+k/StaticFromBaseClass.kt");
        }

        @TestMetadata("StaticGenericMethod.kt")
        public void testStaticGenericMethod() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/j+k/StaticGenericMethod.kt");
        }

        @TestMetadata("SyntheticAfterFiltering.kt")
        public void testSyntheticAfterFiltering() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/j+k/SyntheticAfterFiltering.kt");
        }

        @TestMetadata("SyntheticWithForEach.kt")
        public void testSyntheticWithForEach() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/j+k/SyntheticWithForEach.kt");
        }

        @TestMetadata("typeParameterUse.kt")
        public void testTypeParameterUse() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/j+k/typeParameterUse.kt");
        }
    }

    @TestMetadata("compiler/fir/analysis-tests/testData/resolveWithStdlib/problems")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Problems extends AbstractFirDiagnosticsWithStdlibTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInProblems() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/fir/analysis-tests/testData/resolveWithStdlib/problems"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
        }

        @TestMetadata("invokePriority.kt")
        public void testInvokePriority() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/problems/invokePriority.kt");
        }

        @TestMetadata("KJKComplexHierarchyNestedLoop.kt")
        public void testKJKComplexHierarchyNestedLoop() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/problems/KJKComplexHierarchyNestedLoop.kt");
        }

        @TestMetadata("qualifierPriority.kt")
        public void testQualifierPriority() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/problems/qualifierPriority.kt");
        }

        @TestMetadata("receiverResolutionInLambda.kt")
        public void testReceiverResolutionInLambda() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/problems/receiverResolutionInLambda.kt");
        }

        @TestMetadata("weakHashMap.kt")
        public void testWeakHashMap() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/problems/weakHashMap.kt");
        }
    }

    @TestMetadata("compiler/fir/analysis-tests/testData/resolveWithStdlib/smartcasts")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Smartcasts extends AbstractFirDiagnosticsWithStdlibTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInSmartcasts() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/fir/analysis-tests/testData/resolveWithStdlib/smartcasts"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
        }

        @TestMetadata("tryWithLambdaInside.kt")
        public void testTryWithLambdaInside() throws Exception {
            runTest("compiler/fir/analysis-tests/testData/resolveWithStdlib/smartcasts/tryWithLambdaInside.kt");
        }
    }
}
