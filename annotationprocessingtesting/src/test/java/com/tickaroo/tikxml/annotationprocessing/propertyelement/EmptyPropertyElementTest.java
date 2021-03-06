/*
 * Copyright (C) 2015 Hannes Dorfmann
 * Copyright (C) 2015 Tickaroo, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.tickaroo.tikxml.annotationprocessing.propertyelement;

import com.tickaroo.tikxml.TikXml;
import com.tickaroo.tikxml.annotationprocessing.TestUtils;
import java.io.IOException;
import java.text.ParseException;
import org.junit.*;

/**
 * @author Hannes Dorfmann
 */
public class EmptyPropertyElementTest {

  @Test
  public void emptyStringForEmptyTag() throws IOException, ParseException {
    TikXml xml = new TikXml.Builder().exceptionOnUnreadXml(true).build();

    EmptyStringPropertyElement item =
        xml.read(TestUtils.sourceForFile("empty_property_tag.xml"),
            EmptyStringPropertyElement.class);
    Assert.assertEquals("", item.empty);
  }

  @Test
  public void zeroIntForEmptyTag() throws IOException, ParseException {
    TikXml xml = new TikXml.Builder().exceptionOnUnreadXml(true).build();

    EmptyIntPropertyElement item =
        xml.read(TestUtils.sourceForFile("empty_property_tag.xml"), EmptyIntPropertyElement.class);
    Assert.assertEquals(0, item.empty);
  }

  @Test
  public void zeroLongForEmptyTag() throws IOException, ParseException {
    TikXml xml = new TikXml.Builder().exceptionOnUnreadXml(true).build();

    EmptyLongPropertyElement item =
        xml.read(TestUtils.sourceForFile("empty_property_tag.xml"), EmptyLongPropertyElement.class);
    Assert.assertEquals(0, item.empty);
  }

  @Test
  public void zeroDoubleForEmptyTag() throws IOException, ParseException {
    TikXml xml = new TikXml.Builder().exceptionOnUnreadXml(true).build();

    EmptyDoublePropertyElement item =
        xml.read(TestUtils.sourceForFile("empty_property_tag.xml"),
            EmptyDoublePropertyElement.class);
    Assert.assertEquals(0, 0, item.empty);
  }

  @Test
  public void falseBooleanForEmptyTag() throws IOException, ParseException {
    TikXml xml = new TikXml.Builder().exceptionOnUnreadXml(true).build();

    EmptyBooleanPropertyElement item =
        xml.read(TestUtils.sourceForFile("empty_property_tag.xml"),
            EmptyBooleanPropertyElement.class);
    Assert.assertEquals(false, item.empty);
  }
}