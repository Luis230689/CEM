/**
 * Copyright (C) 2009-2014 BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.bimserver.models.store.impl;

import org.bimserver.emf.IdEObjectImpl;

import org.bimserver.models.store.OAuthServer;
import org.bimserver.models.store.StorePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OAuth Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.store.impl.OAuthServerImpl#getRegistrationUrl <em>Registration Url</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.OAuthServerImpl#getClientId <em>Client Id</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.OAuthServerImpl#getClientSecret <em>Client Secret</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.OAuthServerImpl#getExpiresIn <em>Expires In</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.OAuthServerImpl#getIssuedAt <em>Issued At</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.OAuthServerImpl#getApiUrl <em>Api Url</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.OAuthServerImpl#getRegistrationEndpoint <em>Registration Endpoint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OAuthServerImpl extends IdEObjectImpl implements OAuthServer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OAuthServerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StorePackage.Literals.OAUTH_SERVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegistrationUrl() {
		return (String) eGet(StorePackage.Literals.OAUTH_SERVER__REGISTRATION_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistrationUrl(String newRegistrationUrl) {
		eSet(StorePackage.Literals.OAUTH_SERVER__REGISTRATION_URL, newRegistrationUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClientId() {
		return (String) eGet(StorePackage.Literals.OAUTH_SERVER__CLIENT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientId(String newClientId) {
		eSet(StorePackage.Literals.OAUTH_SERVER__CLIENT_ID, newClientId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClientSecret() {
		return (String) eGet(StorePackage.Literals.OAUTH_SERVER__CLIENT_SECRET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientSecret(String newClientSecret) {
		eSet(StorePackage.Literals.OAUTH_SERVER__CLIENT_SECRET, newClientSecret);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getExpiresIn() {
		return (Long) eGet(StorePackage.Literals.OAUTH_SERVER__EXPIRES_IN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpiresIn(long newExpiresIn) {
		eSet(StorePackage.Literals.OAUTH_SERVER__EXPIRES_IN, newExpiresIn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIssuedAt() {
		return (String) eGet(StorePackage.Literals.OAUTH_SERVER__ISSUED_AT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssuedAt(String newIssuedAt) {
		eSet(StorePackage.Literals.OAUTH_SERVER__ISSUED_AT, newIssuedAt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApiUrl() {
		return (String) eGet(StorePackage.Literals.OAUTH_SERVER__API_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApiUrl(String newApiUrl) {
		eSet(StorePackage.Literals.OAUTH_SERVER__API_URL, newApiUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegistrationEndpoint() {
		return (String) eGet(StorePackage.Literals.OAUTH_SERVER__REGISTRATION_ENDPOINT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistrationEndpoint(String newRegistrationEndpoint) {
		eSet(StorePackage.Literals.OAUTH_SERVER__REGISTRATION_ENDPOINT, newRegistrationEndpoint);
	}

} //OAuthServerImpl
