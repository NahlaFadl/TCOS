package com.example.designsystem.baseToken.semanticTokens

import com.example.designsystem.baseToken.ColorsPalette

val defaultLightColors: ColorScheme = ColorScheme(
    primary = ColorsPalette.sky.t800,
    primaryVariant = ColorsPalette.sky.t50,
    secondary = ColorsPalette.coffee.t800,
    secondaryVariant = ColorsPalette.coffee.t50,
    container = ColorsPalette.white,
    background = ColorsPalette.grey.t100,
    onPrimary = ColorsPalette.grey.t50,
    shadePrimary = ColorsPalette.grey.t800,
    shadeSecondary = ColorsPalette.grey.t600,
    shadeTertiary = ColorsPalette.grey.t500,
    shadeQuaternary = ColorsPalette.grey.t300,
    disable = ColorsPalette.grey.t400,
    onDisable = ColorsPalette.grey.t600,
    error = ColorsPalette.cherry.t600,
    errorVariant = ColorsPalette.cherry.t50,
    success = ColorsPalette.lime.t600,
    successVariant = ColorsPalette.lime.t50,
    warning = ColorsPalette.honey.t500,
    warningVariant = ColorsPalette.honey.t50,
    )

val defaultDarkColors: ColorScheme = ColorScheme(
    primary = ColorsPalette.sky.t500,
    primaryVariant = ColorsPalette.sky.t900,
    secondary = ColorsPalette.coffee.t500,
    secondaryVariant = ColorsPalette.coffee.t900,
    container = ColorsPalette.grey.t800,
    background = ColorsPalette.grey.t900,
    onPrimary = ColorsPalette.grey.t50,
    shadePrimary = ColorsPalette.grey.t100,
    shadeSecondary = ColorsPalette.grey.t400,
    shadeTertiary = ColorsPalette.grey.t500,
    shadeQuaternary = ColorsPalette.grey.t700,
    disable = ColorsPalette.grey.t600,
    onDisable = ColorsPalette.grey.t700,
    error = ColorsPalette.cherry.t400,
    errorVariant = ColorsPalette.cherry.t900,
    success = ColorsPalette.lime.t400,
    successVariant = ColorsPalette.lime.t900,
    warning = ColorsPalette.honey.t400,
    warningVariant = ColorsPalette.honey.t800,
)