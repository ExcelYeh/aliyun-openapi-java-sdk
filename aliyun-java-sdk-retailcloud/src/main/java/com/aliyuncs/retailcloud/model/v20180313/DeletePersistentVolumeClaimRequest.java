/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.retailcloud.model.v20180313;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeletePersistentVolumeClaimRequest extends RpcAcsRequest<DeletePersistentVolumeClaimResponse> {
	   

	private String persistentVolumeClaimName;

	private Long appId;

	private Long envId;
	public DeletePersistentVolumeClaimRequest() {
		super("retailcloud", "2018-03-13", "DeletePersistentVolumeClaim", "retailcloud");
		setMethod(MethodType.POST);
	}

	public String getPersistentVolumeClaimName() {
		return this.persistentVolumeClaimName;
	}

	public void setPersistentVolumeClaimName(String persistentVolumeClaimName) {
		this.persistentVolumeClaimName = persistentVolumeClaimName;
		if(persistentVolumeClaimName != null){
			putQueryParameter("PersistentVolumeClaimName", persistentVolumeClaimName);
		}
	}

	public Long getAppId() {
		return this.appId;
	}

	public void setAppId(Long appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId.toString());
		}
	}

	public Long getEnvId() {
		return this.envId;
	}

	public void setEnvId(Long envId) {
		this.envId = envId;
		if(envId != null){
			putQueryParameter("EnvId", envId.toString());
		}
	}

	@Override
	public Class<DeletePersistentVolumeClaimResponse> getResponseClass() {
		return DeletePersistentVolumeClaimResponse.class;
	}

}
