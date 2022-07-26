package de.falco.phoenixgames.packets.util;

public class FtpUserData {
	
	public String name;
	public String password;
	public String homeDirectory;
	public boolean writePermission;
	public int maxDownloadRate;
	public int maxUploadRate;
	public boolean enabled;
	public int maxIdleTime;
	public int maxConcurrentLoginsPerIP;
	public int maxConcurrentLogins;
	
	
	
	@Override
	public String toString() {
		return "FtpUserData [name=" + name + ", password=" + password + ", homeDirectory=" + homeDirectory
				+ ", writePermission=" + writePermission + ", maxDownloadRate=" + maxDownloadRate + ", maxUploadRate="
				+ maxUploadRate + ", enabled=" + enabled + ", maxIdleTime=" + maxIdleTime
				+ ", maxConcurrentLoginsPerIP=" + maxConcurrentLoginsPerIP + ", maxConcurrentLogins="
				+ maxConcurrentLogins + "]";
	}

}
