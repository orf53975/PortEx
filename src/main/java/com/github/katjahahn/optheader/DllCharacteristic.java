package com.github.katjahahn.optheader;

import com.github.katjahahn.Characteristic;

public enum DllCharacteristic implements Characteristic {
	RESERVED_1,
	RESERVED_2,
	RESERVED_4,
	RESERVED_8,
	IMAGE_DLL_CHARACTERISTICS_DYNAMIC_BASE,
	IMAGE_DLL_CHARACTERISTICS_FORCE_INTEGRITY,
	IMAGE_DLL_CHARACTERISTICS_NX_COMPAT,
	IMAGE_DLLCHARACTERISTICS_NO_ISOLATION,
	IMAGE_DLLCHARACTERISTICS_NO_SEH,
	IMAGE_DLLCHARACTERISTICS_NO_BIND,
	RESERVED_1000,
	IMAGE_DLLCHARACTERISTICS_WDM_DRIVER,
	IMAGE_DLLCHARACTERISTICS_TERMINAL_SERVER_AWARE;
}
