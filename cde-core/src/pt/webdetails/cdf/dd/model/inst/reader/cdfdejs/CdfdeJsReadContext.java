/*!
 * Copyright 2002 - 2017 Webdetails, a Pentaho company. All rights reserved.
 *
 * This software was developed by Webdetails and is provided under the terms
 * of the Mozilla Public License, Version 2.0, or any later version. You may not use
 * this file except in compliance with the license. If you need a copy of the license,
 * please go to http://mozilla.org/MPL/2.0/. The Initial Developer is Webdetails.
 *
 * Software distributed under the Mozilla Public License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. Please refer to
 * the license for the specific language governing your rights and limitations.
 */

package pt.webdetails.cdf.dd.model.inst.reader.cdfdejs;

import pt.webdetails.cdf.dd.model.core.reader.IThingReadContext;
import pt.webdetails.cdf.dd.model.meta.MetaModel;
import pt.webdetails.cdf.dd.structure.DashboardWcdfDescriptor;

public class CdfdeJsReadContext implements IThingReadContext /* extends DefaultThingReadContext */ {
  private final DashboardWcdfDescriptor _wcdf;
  private final MetaModel _metaModel;
  private CdfdeJsThingReaderFactory factory;

  public CdfdeJsReadContext( CdfdeJsThingReaderFactory factory, DashboardWcdfDescriptor wcdf, MetaModel metaModel ) {
    assert factory != null;
    assert wcdf != null;
    assert metaModel != null;

    this.factory = factory;

    this._wcdf = wcdf;
    this._metaModel = metaModel;
  }

  public final DashboardWcdfDescriptor getWcdf() {
    return this._wcdf;
  }

  public final MetaModel getMetaModel() {
    return this._metaModel;
  }

  public CdfdeJsThingReaderFactory getFactory() {
    return factory;
  }
}
