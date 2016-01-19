package org.intellij.elmlang.elmplugin;

import com.intellij.testFramework.ParsingTestCase;

public class ModuleParsingTest extends ParsingTestCase {
    public ModuleParsingTest() {
        super("", "elm", new ElmParserDefinition());
    }

    public void testSimplest() {
        doTest(true);
    }

    public void testExposingAll() {
        doTest(true);
    }

    public void testExposingSomeMembers() {
        doTest(true);
    }

    public void testPathName() {
        doTest(true);
    }

    @Override
    protected String getTestDataPath() {
        return "testData/parsing/module";
    }

    @Override
    protected boolean skipSpaces() {
        return false;
    }

    @Override
    protected boolean includeRanges() {
        return true;
    }
}